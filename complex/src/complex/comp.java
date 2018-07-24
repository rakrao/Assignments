package complex;

public class comp {
	float real;
	float imaginary;
	
	public float set(float x,float y)
	{
		real=x;
		imaginary=y;
		
		return x+y;
	}
	void display()
	{
		System.out.println("real="+real);
		System.out.println("imaginary="+imaginary);
	}
public float add(float a, float b)
{
	return a+b;
}
}
