package Interface;

interface demoInterface 
{
	public void m1();
	public void m2();
}

abstract class ServiceProvider implements demoInterface 
{
	public void m1()
	{
		
	}
	
//	public void m2() {
//
	}
	
	class SubServiceProvider extends ServiceProvider
	{
		public void m2()
		{
		}
	}  
	

	