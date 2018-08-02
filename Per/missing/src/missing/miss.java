//program to find missing number
package missing;

public class miss { /// class
	static int getMissingNo(int a[], int n) {
		int i, total;
		total = (n + 1) * (n + 2) / 2; // logic
		for (i = 0; i < n; i++)
			total -= a[i];
		return total;
	}

	public static void main(String args[]) // main
	{
		int a[] = { 1, 2, 4, 5, 6 };
		int miss = getMissingNo(a, 5); // passing values
		System.out.println(miss);
	}

}
