import java.util.*;

class EvenOdd

{
    
    public static void main(String[] args)
    {
           int var;      
     Scanner scan= new Scanner(System.in);
         System.out.println("enter a number");
           var=scan.nextInt();

       if(var%2==0)
         System.out.println("even number");
       else
         System.out.println("odd number");
    }
}