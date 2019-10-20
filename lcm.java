import java.util.*;
class lcm
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
		int b=ob.nextInt();
		int min=a<b?a:b;
		int max=a>b?a:b;
		for(int i=min;i>=1;i--)
			if(a%i==0&&b%i==0)
			{
				System.out.println("HCF ::::"+i);

			}
		for(int i=max;i<=a*b;i++)
			if(a%i==0&&b%i==0)
			{
				System.out.println("LCM :::"+i);
			}


	}

}