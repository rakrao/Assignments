
public class Timet { // test class
	int hours;
	int minutes;

	public int set(int x, int y) // set method
	{
		hours = x;
		minutes = y;

		return x + y;
	}

	void display() // display methos
	{
		System.out.println("hour=" + hours);
		System.out.println("minute=" + minutes);
	}

	public int add(int a, int b) // add method
	{
		return a + b;
	}
}
