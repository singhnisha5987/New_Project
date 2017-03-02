import java.util.*;
class ForLoop
{
        public static void main(String[] args)
        {
            int n;
            Scanner scan=new Scanner(System.in);
            System.out.println("how many numbers you want to print??");
            n=scan.nextInt();
            for(int i=0;i<=n;i++)
               {
                   System.out.println("numbers:"+i);
               } 
        }
}