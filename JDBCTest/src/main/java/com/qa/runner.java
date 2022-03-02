package com.qa;

import java.sql.SQLException;

import DataAccessObject.MovieDAO;
import domain.Movie;

public class runner {
	
	public static void main(String[] args) throws SQLException {
		Movie Movie1 = new Movie();
		Movie Movie2 = new Movie(1, "The Boy", "Horror", 7);
		Movie Movie3 = new Movie(2, "John Wick", "Elite", 10);
		Movie ChangedMovie = new Movie(3, "Harold and Kumar","Comedy", 9);
		Movie Movie4 = new Movie(4, "Fast and Furious 3: Tokyo Drift", "Elite", 10);
		MovieDAO dao = new MovieDAO();
//		dao.create(Movie1);
//		dao.create(Movie2);
//		dao.create(Movie3);
//		dao.create(Movie4);
//		dao.create(ChangedMovie);
//		dao.delete(1);
//		dao.update(ChangedMovie, 1);
//		System.out.println(dao.realAll());
//		System.out.println(dao.readById(2));
		System.out.println(dao.readByIdPrepared(3));
	}
}
