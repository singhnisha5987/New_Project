//import java.util.*;
package project_java;
import java.util.*;
public class ConstructorOverloadMain {

	public static void main(String[] arg)
	{
		int s,l,w,h;
		Scanner scan=new Scanner(System.in);
		ConstructorOverload obj1=new ConstructorOverload();
		obj1.display();
		
		System.out.println("enter size of square");
		s=scan.nextInt();
		ConstructorOverload obj2=new ConstructorOverload(s);
		obj2.display();
		
		System.out.println("enter l h and w");
		l=scan.nextInt();
		h=scan.nextInt();
		w=scan.nextInt();
		ConstructorOverload obj3=new ConstructorOverload(l,h,w);
		obj3.display();
		
	}
}
