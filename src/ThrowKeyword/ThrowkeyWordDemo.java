package ThrowKeyword;

import java.io.IOException;

public class ThrowkeyWordDemo {
	
	static void checkAge(int age)throws ArithmeticException,IOException
	{
		if(age<18)
		{
			throw new ArithmeticException("Access Denied- Age must be atleast 18 years");
		}
		else
		{
			System.out.println("Access Granted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		checkAge(19);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		System.out.println("thank you");

	}

}
