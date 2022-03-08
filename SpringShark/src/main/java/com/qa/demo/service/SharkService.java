package com.qa.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.demo.entity.Shark;
import com.qa.demo.repo.SharkRepo;

@Service
public class SharkService implements SharkServiceMethods<Shark> {
	private SharkRepo repo;

	public SharkService(SharkRepo repo) {
		this.repo = repo;
	}

	public SharkRepo getRepo() {
		return repo;
	}

	public void setRepo(SharkRepo repo) {
		this.repo = repo;
	}

	@Override
	public Shark create(Shark shark) {
		return this.repo.save(shark);
	}

	@Override
	public List<Shark> readAll() {
		return this.repo.findAll();
	}

	@Override
	public Shark readById(long id) {
		Optional<Shark> SharkId = this.repo.findById(id);
		if(SharkId.isPresent()){
			return SharkId.get();
		}
		return null;
	}

	@Override
	public Shark update(long id, Shark shark) {
		Optional<Shark> existing = this.repo.findById(id);
		if(existing.isPresent()) {
			Shark existance = existing.get();
			existance.setLength(shark.getLength());
			existance.setName(shark.getName());
			existance.setSharkType(shark.getSharkType());
			existance.isVtuber();
			return this.repo.saveAndFlush(existance);
		}
		return null;
	}

	@Override
	public boolean delete(long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

}
