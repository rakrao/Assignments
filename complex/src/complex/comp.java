//program about complex numbers
package complex;

public class comp { // class definition
	float real;
	float imaginary;

	public float set(float x, float y) // set function
	{
		real = x;
		imaginary = y;

		return x + y;
	}

	void display() // display function
	{
		System.out.println("real=" + real);
		System.out.println("imaginary=" + imaginary);
	}

	public float add(float a, float b) // add function
	{
		return a + b;
	}
}
