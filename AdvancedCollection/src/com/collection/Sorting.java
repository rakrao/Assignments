package com.collection;

import java.util.Comparator; //packages

public class Sorting implements Comparator<SavingAccount> {
	public int compare(SavingAccount a, SavingAccount b) {
		return a.getAcc_ID() - b.getAcc_ID(); // compare logic
	}
}
