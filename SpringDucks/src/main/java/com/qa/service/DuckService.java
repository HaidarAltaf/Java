package com.qa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.qa.Ducks.entity.Duck;
import com.qa.Repo.DuckRepo;

@Service
public class DuckService implements ServiceMethods<Duck>{
	//not making a new object but instead creates var of type DuckRepo
	private DuckRepo repo;
	
	//cant instantiate an interface therefore below code will not work
	//DuckRepo repo = new Duckrepo
	
	//constructor
	public DuckService(DuckRepo repo) {
		this.repo = repo;
	}
	
	
	@Override
	public Duck create(Duck duck) {
		return this.repo.save(duck);
	}

	@Override
	public List<Duck> readAll() {
		return this.repo.findAll();
	}

	@Override
	public Duck readById(long id) {
		Optional<Duck> getDuck = this.repo.findById(id);
		if(getDuck.isPresent()) {
			return getDuck.get();
		}
		return null;
	}

	//when setting values DONT set id
	@Override
	public Duck update(long id, Duck duck) {
		Optional<Duck> existingDuck = this.repo.findById(id);
		if(existingDuck.isPresent()) {
			Duck exists = existingDuck.get();
			exists.setAge(duck.getAge());
			exists.setGender(duck.getGender());
			exists.setHabitat(duck.getHabitat());
			exists.setName(duck.getName());
			return this.repo.saveAndFlush(exists);
		}
		return null;
	}

	
	//Deletes by id and checks to see if it still exists (will be true if worked)
	@Override
	public boolean delete(long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}


	public DuckRepo getRepo() {
		return repo;
	}


	public void setRepo(DuckRepo repo) {
		this.repo = repo;
	}

}
