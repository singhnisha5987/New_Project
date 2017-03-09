package project_java;

public class UseCalculator {

	public int add(int v1,int v2)
	{
		return v1+v2;
	}
	public int mul(int v1,int v2)
	{
		return v1*v2;
	}
	public void show()
	{
		System.out.println("addition result:"+add(10,20));
		System.out.println("multiplication result:"+mul(10,20));
	}
	public static void main(String[] arg)
	{
		new UseCalculator().show();
	}
}
