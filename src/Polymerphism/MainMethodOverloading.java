package Polymerphism;

public class MainMethodOverloading {
	
	void main(int x)//1st
	{
		System.out.println("1st x :" + x);
	}
	
	static void main(double x)//2st
	{
		System.out.println(" 2nd x :" + x);
	}
	
	void main(int x, int y)//3st
	{
		System.out.println(" 3rd x :" + x);
		System.out.println(" 3rd y :" + y);
	}
    
	//Entry point for JVM
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainMethodOverloading obj = new MainMethodOverloading();
		main(8.5);
		obj.main(99);
		obj.main(66, 55);

	}

}
