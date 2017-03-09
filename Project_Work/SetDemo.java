package project_java;
import java .util.*;
public class SetDemo {

	public static void main(String arg[])
	{
		HashSet hs=new HashSet();
	    hs.add("snitaaaaa");
	    hs.add("sumit");
	    hs.add("nisha");
	   // Scanner scan=new Scanner(System.in);
	    //System.out.println("enter name");
	   // hs.add(scan.next());
	    System.out.println(hs);
	    
	    TreeSet ts=new TreeSet(hs);
	    System.out.println(ts);
	    
	    LinkedHashSet lhs=new LinkedHashSet();
	    lhs.add("ssssss");
	    lhs.add("ppppp");
	    lhs.add("aaaa"); 
	    System.out.println(lhs);
	}
}
