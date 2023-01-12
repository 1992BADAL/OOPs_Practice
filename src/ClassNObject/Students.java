package ClassNObject;

public class Students {
	
	//instance variables
	String name;
	int rollno;
	
	//method to insertRecord
	void insertRecord(String studentName, int studentRollno) {
		
		name = studentName;
		rollno = studentRollno;
		
	}
	
	
	//methods
	void displayInformation() {
		//code to be executed
		System.out.println("Name :" + name);
		System.out.println("Rollno :" + rollno);
	}

	

}
