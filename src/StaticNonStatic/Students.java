package StaticNonStatic;

public class Students {
	
	//Class variables
	int roll; //Non static variable, unique for each students
	String studentName; //Non static variable, unique for each students
	
    static String collegeName = "Birla college"; //static variables, memory allocated only once 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students student1 = new Students();
		student1.roll = 101;
		student1.studentName = "Akash";
		
		System.out.println(student1.roll + ", "+student1.studentName + ", "+ student1.collegeName );
		
		
		Students student2 = new Students();
		student2.roll = 102;
		student2.studentName = "Badal";
		
		System.out.println(student2.roll + ", "+student2.studentName + ", "+ student2.collegeName );

	}

}
