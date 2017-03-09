package project_java;

import java.util.*;

public class ArrayListDemo1 {
	
	public static void main(String []args)
	{

	ArrayList list=new ArrayList ();
	list.add("gagan");
	list.add("suresh");
	
	list.add(100);
	list.add(200);
	
	Object obj=list.get(1);
	String str=(String)obj;
	
	Object ob=list.get(3);
	Integer i=(Integer)ob;
	System.out.println(str);
	System.out.println(i);
	System.out.println(list);
	}
}
