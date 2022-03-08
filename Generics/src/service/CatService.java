package service;

import java.util.List;

import domain.Cat;
import generic.CatStuff;

public class CatService implements CatStuff<Cat>{

	@Override
	public Cat create(Cat t) {
		return null;
	}

	@Override
	public List<Cat> getAll() {
		return null;
	}

	@Override
	public Cat getById(long id) {
		return null;
	}

	@Override
	public Cat update(long id, Cat t) {
		return null;
	}

	@Override
	public boolean delete(long id) {
		return false;
	}
}
