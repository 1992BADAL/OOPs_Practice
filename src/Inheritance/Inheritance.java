package Inheritance;


class A //Parent class
{
	int a;
	void display()
	{
		System.out.println("class A: " + a);
	}
} 

class B extends A //Child class of class A
{ 
	int b;
	void print()
	{
		System.out.println("class B: " + b);
	}
}

class c extends B
{
	int c;
	void printC()
	{
		System.out.println("class C: " + c);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A objA = new A();
//		
//		objA.a = 20 ;
//		objA.display();
//		
//		B objB = new B();
//		objB.a = 46;  //Class A
//		objB.b = 55;  //Class B
//		
//		objB.display(); //Class A
//		objB.print(); //Class B
		
		c objC = new c();  //Create object of class C
		objC.a = 100;  // class A
		objC.b = 200;  //class B
		objC.c = 300; // class c
		
		objC.display();
		objC.print();
		objC.printC();

	}

}
