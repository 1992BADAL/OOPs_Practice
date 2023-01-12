package TryCatchFinally;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//Arithmetic exception
		try {
		int result = 0/5;
		System.out.println("Result: " + result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("CatchBlock");
		System.out.println(e.toString());
		}
		finally
		{
		System.out.println("Finally block");
	
	}

//		try {
//	//NullPointer Exception
//	String s = null;
//	
//	System.out.println(s.length());
//	}
//		catch(NullPointerException e)
//		{
//			System.out.println(e.toString());
//		}
//		
//		System.out.println("Hello JAva");
//		

		// Number format exception
//		try
//		{
//			String s = "124"; //for exception use s="abc"
//			int i = Integer.parseInt(s);
//			System.out.println(i);
//		}
//		catch(NumberFormatException e)
//		{
//			System.out.println("Catch block " +  e.toString());
//		}
//		finally
//		{
//			System.out.println("Finally block executed");
//		}
		
		
		}

		// Array Index out of bound Exception
//		try {
//			int a[] = new int[5];
//			a[7] = 5; // a[0], a[1], a[2], a[3], a[4]
//		} catch (ArrayIndexOutOfBoundsException e) 
//		{
//			System.out.println("catch block "+ e.toString());
//		}
//		
//		finally
//		{
//			System.out.println("Finally block executed");
//		}
//		
	
}
