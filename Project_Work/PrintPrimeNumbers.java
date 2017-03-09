package project_java;

public class PrintPrimeNumbers {
	public static void main(String[] args)
	{
		boolean flag=true;
		for(int n=2;n<=100;n++)
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				
				}
			}
			if(flag)
			{
				System.out.println(n);
			}
		}
	}

}
