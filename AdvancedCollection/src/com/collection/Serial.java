package com.collection;

import java.io.FileNotFoundException; //packages
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serial {
	public static void main(String[] args) { // main method
		ArrayList<SavingAccount> list = new ArrayList<>(); // ArrayList
		SavingAccount sal1 = new SavingAccount(1000.0, 1234, "Rakshith", true);
		SavingAccount sal2 = new SavingAccount(2000.0, 1233, "Rao", true);
		SavingAccount sal3 = new SavingAccount(3000.0, 1244, "Ram", true);
		SavingAccount sal4 = new SavingAccount(4000.0, 1254, "Rakesh", true);
		SavingAccount sal5 = new SavingAccount(5000.0, 1298, "Raghu", true);

		list.add(sal1);
		list.add(sal2);// Adding to list
		list.add(sal3);
		list.add(sal4);
		list.add(sal5);

		String fileName = "list.ser"; // file declaration

		try (FileOutputStream fos = new FileOutputStream(fileName); // try block
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(list);
			System.out.println("Serialization successful...");
		} catch (FileNotFoundException e) { // catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
