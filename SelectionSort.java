import java.util.*;
class SelectionSort{
	public static void main(String[] args) {
		int size;
		System.out.println("Enter the size of array");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the Element for the arrays ::");
		for (int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Your Arrays is here ::\n"+Arrays.toString(a));
		int min,temp=0;
		for(int i=0;i<a.length;i++){
			min=i;
			for (int j=i+1;j<a.length;j++) {
				if(a[j]<a[min])
				{
					min=j;
				}
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
					
			}
			

		}

	

	}
}