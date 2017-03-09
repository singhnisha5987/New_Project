package project_java;

public class Student {

	String studid,studname,addr;
	public Student(String sid,String sname,String addr)
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
