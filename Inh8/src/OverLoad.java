//This explains about function overloading
class Parent { // base class
	int i;

	public Parent(int i) {
		this.i = i;
	}

	void disp() {
		System.out.println("From parent display");
	}
}

class Child extends Parent { // sub class

	public Child(int i, int j) {
		super(i);

	}

	void disp() {
		System.out.println("From child display");
	}
}

public class OverLoad {
	public static void main(String[] args) { // main function
		Child c = new Child(5, 7);
		c.disp();
	}
}
