//This explains about function overriding
package inh7;

class Parent { // base class

	void disp() {
		System.out.println("Parent show");
	}

}

class Child extends Parent { // sub class
	void disp() {
		System.out.println("Child show");
	}
}

class OverRide {
	public static void main(String[] args) { // main function
		Parent p1 = new Parent();
		p1.disp();
		Parent p2 = new Child();
		p2.disp();
	}
}
