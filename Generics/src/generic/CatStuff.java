package generic;

import java.util.List;

public interface CatStuff <T>{
	//CRUD FUNCTIONS
	
	//CREATE
	T create(T t);
	
	//READ ALL
	List<T> getAll();
	
	//READ BY ID
	T getById (long id);
	
	//UPDATE
	T update(long id, T t);
	
	//DELETE
	boolean delete(long id);

}
