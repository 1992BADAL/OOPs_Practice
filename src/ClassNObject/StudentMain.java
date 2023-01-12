package ClassNObject;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		//Create Object
		Students student1 = new Students();
		Students student2 = new Students();
		
		
		//initialize object
		student1.insertRecord("Priya", 101);
		student2.insertRecord("Ram", 102);
		
		//print information
		student1.displayInformation();
		student2.displayInformation();
		
		
		
	}

}
