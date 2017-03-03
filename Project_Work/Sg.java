package project_java;
import java.util.*;
public class Sg {
	public static void main(String[] args)
	{
	int wd;
   Scanner scan=new Scanner(System.in);
   System.out.println("enter width:");
   wd=scan.nextInt();
   SetterGetter obj=new SetterGetter();
   obj.setter(wd);
  // obj.getter();
   System.out.println("value of width is:"+obj.getter());
	}
   
}
