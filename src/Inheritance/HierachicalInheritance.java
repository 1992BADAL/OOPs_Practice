package Inheritance;

class parent
{
	int a;
	void display()
	{
		System.out.println("class parent: " + a);
	}
}

class child1 extends parent
{
	int b;
	void displaychild1()
	{
		System.out.println("class child1: " + b);
	}
}

class child2 extends parent
{
	int c;
	void displaychild2()
	{
		System.out.println("class child2: " + c);
	}
}

public class HierachicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child1 obj1 = new child1();
		obj1.a = 100;
		obj1.b = 200;
		
		obj1.display(); // parent
		obj1.displaychild1(); //child1
		
		child2 obj2 = new child2();
		obj2.a = 300;
		obj2.c = 400;
		
		obj2.display();  // parent
		obj2.displaychild2();  //child2
		

	}

}
