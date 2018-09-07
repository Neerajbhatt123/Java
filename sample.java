import java.util.*;
class sample
{
	public static void main(String[] args) 
	{
		Sacnner sc=new Sacnner(System.in);
		int num=sc.nextInt();
		int factorcount;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				factorcount++;
			if(factorcount==2)
				System.out.println("Prime number is found");
			else
				System.out.println("not a prime number");
		}
	}
}