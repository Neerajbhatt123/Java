import java.util.*;
class Multiply
{
	static int multi(int n,int m)
	{
		if(n>=1)
		{
			return m+multi(n-1,m);
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		System.out.println(multi(5,5));
	}
}
