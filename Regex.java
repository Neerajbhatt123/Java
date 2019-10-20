import java.util.*;
class Regex
{
	private static Object m;
	public static void main(String[] args) 
	{
		String x = "ABCD EFGH ABCD EFGH";
		System.out.println(x.replace("ABCD","Ganesh"));
		System.out.println(String.format("%d is the no. of the student in the class",10));
		for(int a=1;a<11;a++)
		{
			for(int b=1;b<11;b++)
			{
				System.out.printf("%d * %2d = %2d\t",a,b,a*b);			}
		}
		System.out.println();
		System.out.printf("%a",10.0);
		System.out.printf("%o",1000);
	}
}