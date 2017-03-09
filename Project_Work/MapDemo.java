package project_java;
import java.util.*;
public class MapDemo {
   
	public static void main(String arg[])
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("100","suresh,mumbai,9999999");
		hm.put("101","mahesh,delhi,888888");
		Set<String> keys=hm.keySet();
		for(String key:keys)
		{
			System.out.println(key);
			String value=hm.get(key);
			System.out.println(value);
		
			String empvalues[]=value.split(",");
			System.out.println(empvalues[0]);
			System.out.println(".......................");
		}
		
	}
}
