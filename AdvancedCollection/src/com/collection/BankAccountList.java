//Creating object and storing in array list and Linked hash set
package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashSet;

public class BankAccountList {

	public static void main(String[] args) {
		ArrayList<SavingAccount> list = new ArrayList<SavingAccount>();

		// creating objects of savings account
		SavingAccount sal1 = new SavingAccount(1000.0, 1234, "Rakshith", true);
		SavingAccount sal2 = new SavingAccount(2000.0, 1233, "Rao", true);
		SavingAccount sal3 = new SavingAccount(3000.0, 1244, "Ram", true);
		SavingAccount sal4 = new SavingAccount(4000.0, 1254, "Rakesh", true);
		SavingAccount sal5 = new SavingAccount(5000.0, 1298, "Raghu", true);
		// passing objects as values to array list
		list.add(sal1);
		list.add(sal2);
		list.add(sal3);
		list.add(sal4);
		list.add(sal5);
		Collections.sort(list, new Sorting());

		// printing values
		list.stream().forEach((list1) -> System.out.println(list1));
		System.out.println("\n");

		Set<Object> set = new LinkedHashSet<>();
		// passing objects as values to linked hash list
		set.add(sal1);
		set.add(sal2);
		set.add(sal3);
		set.add(sal4);
		set.add(sal5);

		System.out.println("\n");
		// printing values
		set.stream().forEach((list1) -> System.out.println(list1));
		System.out.println("\n");
		set.stream().forEach((set1) -> System.out.println(set1));
	}
}
