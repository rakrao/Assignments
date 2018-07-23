package distance;

public class TestClass {
	public static void main(String[] args) {
		
	
	dis dist1=new dis();
	dis dist2=new dis();
	dis dist3=new dis();
	
	dist1.feet=3;
	dist1.inches=(float) 0.4;
	dist2.feet=3;
	dist2.inches=(float) 0.4;
	dist1.display();
	dist2.display();
	
	float var=dist1.add(dist1.feet,dist1.inches);
	float var1=dist2.add(dist2.feet,dist2.inches);
	System.out.println("distance1="+var);
	System.out.println("distance2="+var1);
	
	float var2=dist3.add(var,var1);
	System.out.println("distance="+var2);
 	}
}
