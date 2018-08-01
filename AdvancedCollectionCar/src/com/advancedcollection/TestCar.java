package com.advancedcollection;

public class TestCar {

	public static void main(String[] args) { // main method

		Parked_CarOwnerList list = new Parked_CarOwnerList(); // object

		Parked_CarOwner_Details details = new Parked_CarOwner_Details("Rakshith", 2004, "KA07", 97407761, "Bangalore");
		Parked_CarOwner_Details details1 = new Parked_CarOwner_Details("Ravi", 2005, "KA06", 87407761, "Mangalore"); // passing
																														// values
		Parked_CarOwner_Details details2 = new Parked_CarOwner_Details("Rakesh", 2008, "KA09", 77407761, "Shimoga");
		Parked_CarOwner_Details details3 = new Parked_CarOwner_Details("Ram", 2009, "KA04", 67407761, "Davangere");

		list.add_new_car(details);
		list.add_new_car(details1); // adding to list
		list.add_new_car(details2);
		list.add_new_car(details3);

		// list.remove_car("KA06");
		list.display();
		boolean FindByCarNo = details.FindByCarNo("KA09"); // checking by name
		if (FindByCarNo) {
			String carNo = "KA09";
			list.verify();
			System.out.println("Parked at floor" + list.floor + " section ->");
			System.out.println(list.section);
		} else
			System.out.println("Car not found");
	}
}
