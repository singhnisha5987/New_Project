package project_java;
import java.util.*;
public class PerfectNumber {
	public static void main(String[] args)
	{
		int num,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		num=scan.nextInt();
		for(int i=1;i<num;i++)
		{
		   if(num%i==0)
		   {
			   sum=sum+i;
		   }
		}
		if(sum==num)
		{
			System.out.println("it is a perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
	}

}
