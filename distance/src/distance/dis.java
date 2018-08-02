//program to find distance in feet and inches
package distance;

public class dis {
	float feet;
	float inches; // instance member

	void set(float x, float y) // set method
	{
		feet = x;
		inches = y;
	}

	void display() // display method
	{
		System.out.println("feet=" + feet);
		System.out.println("inches=" + inches);
	}

	public float add(float a, float b) // add method
	{
		return a + b;
	}
}
