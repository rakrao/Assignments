package com.advancedcollection;

import java.util.LinkedHashSet; //packages

import java.util.List;

public class TestMovieDetails { // test class
	public static void main(String[] args) { // main function

		Movie_DetailsList details = new Movie_DetailsList(); // object

		details.addMovie(new Movie_Details("Villian", "Sudeep", "kriti", "Action")); // adding movies

		details.addMovie(new Movie_Details("Ram", "Puneeth", "Ramya", "Romantic"));

		boolean checkByName = details.FindByName("Dangal"); // checking by name
		if (checkByName) {
			System.out.println("Movie found");
		} else
			System.out.println("Movie not found");

		boolean checkByGenre = ((Movie_DetailsList) details).FindByGenre("Biopic"); // checking by genre
		if (checkByGenre) {
			System.out.println("Movie found");
		} else
			System.out.println("Movie not found");

		details.removeMovie("Dangal");

		details.display(); // display
	}
}
