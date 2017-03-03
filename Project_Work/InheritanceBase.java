package project_java;

public class InheritanceBase {
	int rollnum;
	public InheritanceBase()
	{
		System.out.println("u r in base class default constructor");
	}
	public InheritanceBase(int r)
	{
		System.out.println("u r in base class parameterised constructor");
		rollnum=r;
	}
	
	public void display()
	{
		
		System.out.println("hhheellooo");
		System.out.println("roll number is:"+rollnum);
	}

}
