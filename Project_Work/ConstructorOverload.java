package project_java;

public class ConstructorOverload {

	int length,height,width;
	public ConstructorOverload()//default box
	{
		System.out.println("default constructor");
		width=10;
		height=5;
		length=20;
	}
	public ConstructorOverload(int s)//square box
	{ 
		System.out.println("parameterised constructor with 1 arg");
		length=s;
		height=s;
		width=s;
		
	}
	public ConstructorOverload(int l,int h,int w)//rectangle
	{
		System.out.println("parameterised constructor with 3 arg");
		length=l;
		width=w;
		height=h;
	}
	public void display()
	{
		System.out.println("height is:"+height+"width is:"+width+"length is :"+length);
		System.out.println("..........................");
	}
}
