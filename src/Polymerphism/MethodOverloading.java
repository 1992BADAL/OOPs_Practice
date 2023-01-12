package Polymerphism;

public class MethodOverloading {
	
	void add(int a, int b)
	{
		System.out.println("1st method " + (a+b));
	}
	
	void add(double a, double b)
	{
		System.out.println("2nd method " + (a+b));
	}
	
	void add(int a, double b)
	{
		System.out.println("3rd method " + (a+b));
	}
	
	void add(int a, int b, int c)
	{
		System.out.println("4th method " + (a+b+c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj1 = new MethodOverloading();
		obj1.add(2.5, 2.5);
		obj1.add(5, 5.5);
		obj1.add(4,3, 10);
		obj1.add(50, 1);
		

	}

}
