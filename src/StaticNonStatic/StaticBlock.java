package StaticNonStatic;

public class StaticBlock {
	
	static
	{
		System.out.println("Can we execute program without main method ?");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(
				" NO, till JDK1.6 it was possible by using static block,"
				+ " but since JDK1.7 class connot be executed without main method. ");

	}

}
