package StaticNonStatic;

public class Counter {
	
	//class variable
	//int count =0; //Non static variable, will get memory every time object of the class is created
	
	static int count = 0;
	Counter() //constructor without parameter
	{
		count++; //increment by 1 and retain it old value
		System.out.println(count); //count = 1,2,3
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		Counter obj3 = new Counter();

	}

}
