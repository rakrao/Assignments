//This explains about hierarchical inheritance 
class Parent { // base class
	int i;

	public Parent(int i) {
		this.i = i;
		System.out.println("From inside constructor of parent class");
	}

}

class Child1 extends Parent { // sub class

	public Child1(int i, int j) {
		super(i);
		System.out.println("From inside constructor of child1 class");
	}

}

class Child2 extends Parent { // sub class

	public Child2(int i, int k) {
		super(i);
		System.out.println("From inside constructor of child2 class");
	}

}

class Hierarchical {
	public static void main(String[] args) { // main function
		Parent p = new Parent(10);
		Child1 c1 = new Child1(40, 80);
		Child2 c2 = new Child2(76, 87);
	}
}
