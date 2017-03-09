package project_java;

import java.util.*;

public class ArrayListDemo2 {
	
	public static void main(String []args)
	{

	ArrayList list=new ArrayList ();
	list.add("gagan");
	list.add("suresh");
	
	list.add(100);
	list.add(200);
	
	list.add(new ArrayListDemo3("000","nnnnn","ssssss"));
	
	/*Object obj=list.get(1);
	String str=(String)obj;
	
	Object ob=list.get(3);
	Integer i=(Integer)ob;
	System.out.println(str);
	System.out.println(i);
	System.out.println(list);*/
	
	for(Object element:list)
	{
		if(element instanceof String)
		{
			String str=(String)element;
			System.out.println(str);
		}
		else if(element instanceof Integer)
		{
			Integer o1=(Integer)element;
			System.out.println(o1);
		}
		else
		{
			ArrayListDemo3 ob1=(ArrayListDemo3)element;
			System.out.println(ob1);
		}
	}
	}
}
