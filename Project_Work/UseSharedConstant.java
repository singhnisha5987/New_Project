package project_java;
interface SharedConstant
{
	   int LEFT=1;
}
public class UseSharedConstant implements SharedConstant {
   
	public static void main(String arg[])
	{
		//LEFT=2;
		
		System.out.println(LEFT);
		
	}
	
}
