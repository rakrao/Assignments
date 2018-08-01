package com.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException; //packages
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeSerial {
	public static void main(String[] args) { // main method
		ArrayList<SavingAccount> list;

		try (FileInputStream fis = new FileInputStream("list.ser"); // try block
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			list = (ArrayList<SavingAccount>) ois.readObject(); // object
			System.out.println(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
