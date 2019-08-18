import java.util.*;
class Selection_Sort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=sc.nextInt();
		int[] data = new int[max];
		for(int i=0;i<max;i++)
		{
			data[i] =sc.nextInt();
		}
		// Arrays.sort(data);

		System.out.println(Arrays.toString(data));

	// 	// int size=sc.nextInt();
	// 	// Integer[] arr = new int[size];
	// 	// for(int i=0;i<size;i++)
	// 	// {
	// 	// 	arr[i] =sc.nextInt();
	// 	// }

	// 	// Arrays.sort(arr, Collections.reverseOrder()); 

	// 	// System.out.printf("Modified arr[] : %s", 
 //  //                         Arrays.toString(arr)); 
		
		for (int i=0; i<max; i++) {
			int min = i;
			int temp=0;
			for (int j=i+1; j<max; j++) {
				if (data[j]<data[min]) {
					temp=data[j];
					data[j]=data[min];
					data[min]=temp;
						
				}
				
			}
			
		}
	
		System.out.println(Arrays.toString(data));		
		 // Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100}; 
  
        // Sorts arr[] in descending order 
		// 		Scanner sc=new Scanner(System.in);
		// int max=sc.nextInt();
		// Integer[] data = new Integer[max];
		// for(int i=0;i<max;i++)
		// {
		// 	data[i] =sc.nextInt();
		// }

  //       Arrays.sort(data, Collections.reverseOrder()); 
  
  //       System.out.printf("Modified arr[] : %s", 
  //                         Arrays.toString(data));
	}


}