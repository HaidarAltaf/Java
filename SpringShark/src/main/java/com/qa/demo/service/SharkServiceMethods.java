package com.qa.demo.service;

import java.util.List;

public interface SharkServiceMethods<T> {
	
	//CREATE
	T create(T shark);

	//READ ALL
	List<T>readAll();
	
	//READ BY ID
	T readById(long id);
	
	//UPDATE	
	T update(long id, T shark);
	
	//DELETE
	boolean delete(long id);
	
}