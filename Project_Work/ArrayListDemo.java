package project_java;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("bbbb");
		list.add("cccc");
		for(String obj:list)
		{
			System.out.println(obj);
		}
	}
}
