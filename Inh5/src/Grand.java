//This explains about Multilevel inheritance
class Grand1 { // base class
	int i;

	Grand1(int i) {
		this.i = i;

		System.out.println("From inside the constructor of grand class");
	}

}

class Parent extends Grand1 { // sub class

	Parent(int i, int j) {
		super(i);
		System.out.println("From inside the constructor of Parent class");
	}

}

class Child extends Parent { // sub class

	Child(int i, int j, int k) {
		super(i, j);
		System.out.println("From inside the constructor of Child class");
	}
}

class Grand {
	public static void main(String[] args) { // main function
		Grand1 g = new Grand1(1);
		Parent p = new Parent(5, 7);
		Child c = new Child(3, 4, 7);
	}
}