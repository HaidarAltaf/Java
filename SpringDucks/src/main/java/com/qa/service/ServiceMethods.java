package com.qa.service;

import java.util.List;

public interface ServiceMethods<T> {
	
	//CREATE
	T create(T duck);

	//READ ALL
	List<T>readAll();
	
	//READ BY ID
	T readById(long id);
	
	//UPDATE	
	T update(long id, T duck);
	
	//DELETE
	boolean delete(long id);
	
}
