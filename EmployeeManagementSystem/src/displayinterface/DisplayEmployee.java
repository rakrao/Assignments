package displayinterface;

public class DisplayEmployee implements Display {
private accept a;

public void displaydata()
{
	System.out.println(a.getname());
	System.out.println(a.getid());
	System.out.println(a.getsalary());
}

public void set(accept a)
{
	this.a=a;
}
}
