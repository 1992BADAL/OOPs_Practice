package Constractor;

public class Main {
	
	int x; //attribute of class
	
	Main()//constructor without parameter
	{
		x=10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main obj = new Main(); //this will call the constructor
		
		System.out.println(obj.x);

	}

}
