package com.advancedcollection;

import java.net.StandardSocketOptions;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner; //packages
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Movie_DetailsList { // class

	Set<Movie_Details> movie = new LinkedHashSet<>();

	public void addMovie(Movie_Details movieName) {
		movie.add(movieName);
		System.out.println(movieName.getMov_Name() + " added");
	}

	public void removeMovie(String movieName) {
		Predicate<Movie_Details> delMovie = Movie_Details -> Movie_Details.getMov_Name().equals(movieName);
		movie.remove(delMovie);
	}

	public void removeall() {
		movie.clear();
		System.out.println("all movies deleted");
	}

	public boolean FindByName(String movieName) // functions
	{
		Predicate<Movie_Details> checkMovieByName = Movie_Details -> Movie_Details.getMov_Name().equals(movieName);
		return movie.stream().anyMatch(checkMovieByName);
	}

	public boolean FindByGenre(String genre) {
		Predicate<Movie_Details> checkMovieByGenre = Movie_Details -> Movie_Details.getMov_Name().equals(genre);
		return movie.stream().anyMatch(checkMovieByGenre);
	}

	public void display() {
		Consumer<Movie_Details> disp = Movie_Details -> System.out.println(Movie_Details); // display function
		movie.stream().forEach(disp);
	}
}