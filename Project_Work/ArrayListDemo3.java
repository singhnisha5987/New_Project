package project_java;

public class ArrayListDemo3 {

	String studid,studname,addr;
	public ArrayListDemo3(String sid,String sname,String addr)
	{
		studid=sid;
		studname=sname;
		this.addr=addr;
	}
	public String toString()
	{
		return "studentid="+studid+"studentname="+studname+"address="+addr;
		
	}
	
	public static void main(String[] arg)
	{
		Student obj=new Student("100","nisha","jdhfvbf");
		System.out.println(obj);
	}
}
