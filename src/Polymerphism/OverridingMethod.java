package Polymerphism;

class Bank   // Parent class
{
	double getRateOfInterest()
	{
		return 0.0;
	}
}

class Axis extends Bank  // Child class
{
	double getRateOfInterest() //method overridden : method definition is same as parent class
	{  //change body
		return 5.0;
	}
}

class ICICI extends Bank  // Child class
{
	double getRateOfInterest()
	{
		return 5.9;
	}
}

class SBI extends Bank   // Child class
{
	double getRateOfInterest()
	{
		return 6.1;
	}
}

public class OverridingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Axis objAxis = new Axis();
		System.out.println("Axis Rate of interest: " + objAxis.getRateOfInterest());
		
		ICICI objICICI = new ICICI();
		double iciciRateOfInterest = objICICI.getRateOfInterest();
		System.out.println("ICICI Rate Of Interest: " + iciciRateOfInterest);
		
		SBI objSBI = new SBI();
		System.out.println("SBI Rate of interest: " + objSBI.getRateOfInterest());

	}

}
