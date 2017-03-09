
package project_java;
import java.util.*;
public class CheckPrime {
	public static void main(String[] args)
	{
		int num,flag=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
	    num=scan.nextInt();
	    for(int i=2;i<=num/2;i++)
	    {
	    	if(num%i==0)
	    	{	
	    		flag=1;
	    		break;
	    	}	
	    }
	    if(flag==0)
	    {
	    	System.out.println("yes prime");
	    }
	    else
	    {
	    	System.out.println("not prime");
	    }
	}

}
