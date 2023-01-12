package Interface;

interface A
{
	void Adisplay();
	  void Ashow();
}

interface B
{
  void Bdisplay();
  void Bshow();
}

class AB implements A,B
{
    public void Adisplay()
    {
       System.out.println("A DISPLAYED");
    }
    
     public void Ashow()
    {
       System.out.println("A SHOW");
    }
     public void Bdisplay()
     {
        System.out.println("B DISPLAYED");
     }
     
      public void Bshow()
     {
        System.out.println("B SHOW");
     }


}

class InterfaceAB
{
public static void main(String[]args)
{
AB obj = new AB();
obj.Adisplay();
obj.Ashow();
obj.Bdisplay();
obj.Bshow();
}
}



