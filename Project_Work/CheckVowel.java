import java.util.*;
class CheckVowel
{
   public static void main(String[] args)
    {
          String ch;
          Scanner scan=new Scanner(System.in);
	  
           System.out.println("enter a character:"); 	
          ch=scan.nextLine();

           switch(ch)
           {
               case "A":
                   System.out.println("vowel");
                   break;
               case "E":
                   System.out.println("vowel");
                   break;
               case "I":
                   System.out.println("vowel");
                   break;
               case "O":
                   System.out.println("vowel");
                   break;
               case "U":
                   System.out.println("vowel");
                   break;
               default:
                   System.out.println("notvowel");
 	    
           }
    }
}

   