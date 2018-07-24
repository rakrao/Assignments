//In this array store instance of sub class 
public class ShapeTest1 {
	public static void main(String[] args) { // main function
		ShapeDemo1 shape[] = new ShapeDemo1[5]; // array declaration
		shape[0] = new Circle();
		shape[1] = new Rectangle();
		shape[0].draw();
		shape[1].draw();
	}
}
