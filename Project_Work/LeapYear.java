import java.util.*;
class LeapYear
{
     public static void main(String[] args)
     {
         int yr;
         Scanner scan=new Scanner(System.in);
         System.out.println("enter year");
         yr=scan.nextInt();
         if(yr%100==0)
           {
               if(yr%400==0)
                System.out.println("leap year");
        	else
                System.out.println("not leap year"); 
	   }	
          
         else{

		if(yr%4==0)
           	System.out.println("leap year");
		else
                System.out.println("not leap year");                 
             }
     }
}