
public class C implements B { // class c implements B
	public void disp1() // definition of display function
	{
		System.out.println("Disp1");
	}

	public void disp2() // definition of display function
	{
		System.out.println("Disp2");
	}

	public static void main(String[] args) { // main function
		C c = new C(); // object
		c.disp1();
		c.disp2();
	}

}
