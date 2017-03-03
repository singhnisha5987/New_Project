package project_java;

public class InheritanceDerived extends InheritanceBase {
	public InheritanceDerived()
	{
		//super(45);
		System.out.println("you are in derived class constructor");
	}

	public static void main(String[] arg)
	{
		InheritanceDerived obj=new InheritanceDerived();
		
		obj.display();
	}
}
