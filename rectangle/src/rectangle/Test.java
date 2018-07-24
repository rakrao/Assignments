//This finds whether area of two rectangle are equal or not
package rectangle;

public class Test {
public static void main(String[] args) {
	rec rect2 = new rec();
	rec rect1 = new rec();
	rect1.breadth=10;
	rect2.length=20;
	rect1.breadth=20;
	rect1.length=10;
	int area1=-0;
	int area2=0;
	area1=rect1.area(rect1.breadth,rect1.length);
	area2=rect2.area(rect2.breadth,rect2.length);
	if(area1==area2)
	{
		System.out.println("area are equal"+area1);
		return;
	}
	else
	{
		System.out.println("area are not equal");
	}
}
}
