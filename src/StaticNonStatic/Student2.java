package StaticNonStatic;

public class Student2 {

	// class variable
	int roll;
	String studentName;

	static String collegeName = " Birla College";

	Student2(int rollno, String name) // parameterized constructor
	{
		roll = rollno;
		studentName = name;
	}

	void display() {
		System.out.println(studentName + ", " + roll + ", " + collegeName);
	}

	static void changeValue() {
		collegeName = "RTMNU";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 obj = new Student2(109,"Radha");
		Student2 obj2 = new Student2(108, "Rahul");
		
		obj.display();
		obj2.display();
		
		System.out.println("After clg name change ");
		
		changeValue();
		obj.display();
		obj2.display();

	}

}
