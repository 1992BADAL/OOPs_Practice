package Polymerphism;

public class ConstructorOverloading {
	
	ConstructorOverloading(int x) //1
	{
		System.out.println(x);
	}
	
	ConstructorOverloading(double x) //2
	{
		System.out.println(x);
	}
	
	ConstructorOverloading(double x, double y) //3
	{
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverloading obj1 = new ConstructorOverloading(2.3);
		ConstructorOverloading obj2 = new ConstructorOverloading(3);
		ConstructorOverloading obj3 = new ConstructorOverloading(5.2, 6.3);
		

	}

}
