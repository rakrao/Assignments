package com.advancedcollection;

import java.util.LinkedHashSet; //packages
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Parked_CarOwnerList { // class
	int token = 0;
	int section = 0;
	int floor = 1;
	Set<Parked_CarOwner_Details> set = new LinkedHashSet<>(); // object

	public void add_new_car(Parked_CarOwner_Details Car) // add method
	{
		set.add(Car);
		token += 1;

		verify();
		System.out.println(Car.getCarNo() + " added to floor" + section + " with token no" + token);
	}

	public void remove_car(String carNo) // remove method
	{
		Predicate<Parked_CarOwner_Details> delCar = Parked_CarOwner_Details -> Parked_CarOwner_Details.getCarNo()
				.equals(carNo);
		set.removeIf(delCar);
	}

	public boolean FindByCarNo(String carNo) {
		Predicate<Parked_CarOwner_Details> checkCarByNo = Parked_CarOwner_Details -> Parked_CarOwner_Details.getCarNo()
				.equals(carNo);
		return set.stream().anyMatch(checkCarByNo);

	}

	public void display() {
		Consumer<Parked_CarOwner_Details> disp = Parked_CarOwner_Details -> System.out.println(Parked_CarOwner_Details); // display
																															// function
		set.stream().forEach(disp);
	}

	public void verify() // verify function
	{

		if (token > 20 && section < 4) {
			section += 1;
			token = 0;
			System.out.println("Parking available at " + section + " with token " + token + " at floor no " + floor);
		} else if (token > 20 && section > 4) {
			floor += 1;
			token = 0;
			section = 0;
			if (floor > 3) {
				System.out.println("No parking space");

			}
			System.out.println("Parking available at " + section + " with token " + token + " at floor no " + floor);
		} else {
			System.out.println("Parking available");
		}

	}
}
