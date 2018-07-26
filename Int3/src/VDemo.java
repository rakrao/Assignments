
public class VDemo {
	public static void main(String[] args) { // main function
		Vehicle[] v = new Vehicle[3]; // creating array
		v[0] = new TwoWheeler();
		v[1] = new ThreeWheeler(); // calling function using object
		v[2] = new FourWheeler();
		v[0].start();
		v[1].start();
		v[2].start();
	}
}
