import java.util.*;
class Arraya{
	public static void main(String[] args) {
		int size;

		Scanner sc =new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];

		for (int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
			
		}

		System.out.println(Arrays.toString(arr));

		for (int i =0; i<arr.length; i++) {

			for (int j=0;j<arr.length-1 ;j++ ) {
				if (arr[j]>arr[j+1]) {
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
			
			System.out.println(Arrays.toString(arr));
		}
	}
}