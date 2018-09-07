import java.util.Scanner;
class Table
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of table you want to dispaly::");
		int t=sc.nextInt();
		for(int i=1;i<11;i++)
		{
			System.out.println(t+"*"+i+"="+t*i);
		}

	}
}