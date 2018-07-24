//This explains about single level inheritance
public class SingleLevel { // base class
	int x;

	public SingleLevel(int _x) {
		x = _x;

	}

}

class Derived extends SingleLevel { // sub class
	int y;

	public Derived(int _x, int _y) {
		super(_x);
		y = _y;

	}

	void Display() { // display function
		System.out.println("x=" + x + ", y = " + y);
	}

	public static void main(String[] args) { // main function
		Derived d = new Derived(10, 20);
		d.Display();
	}
}