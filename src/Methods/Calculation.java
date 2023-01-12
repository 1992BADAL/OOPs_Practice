package Methods;

public class Calculation {
	
	//modifier returntype nameofmethod(parameter list){
	//method body
	//}
	//method
	 void printMessage() {
		System.out.println("Welcome Java");
	}
	 //method to sum Two numbers
	 static int sum(int a , int b) {
		 
		 return (a*b);
	 }
	 
	 static int minimum(int a , int b)
	 {
		 if(a<b)
			 return a;
		 else
			 return b;
	 }

	//entry point of the application
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call method using class object
		Calculation calcObject = new Calculation();
		calcObject.printMessage();
		
		int result = sum(2,4);
		
		System.out.println("sum of a & b is = " + result);
		
		System.out.println(minimum(12,14));

	}

}
