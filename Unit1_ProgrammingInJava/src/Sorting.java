import java.util.Scanner;//Scanner.class file is in the folder java/util

public class Sorting {

	public static void main(String[] args) {
		int[] number = new int[100];
		Scanner input = new Scanner(System.in);
		System.out.println("How many number?: ");
		int n = input.nextInt(); // integer value justlike %d in c
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter item at number [%d]: ",i);
			number[i]=input.nextInt();
			System.out.println();
		} 
		System.out.println("Unsorted data is: ");
		for (int i=0;i<n;i++) {
			System.out.print(number[i]+" ");
		}
		
		//Sorting array
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(number[i]>number[j]) {
					int temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
		System.out.println("\nSorted data is: ");
		for (int i=0;i<n;i++) {
			System.out.print(number[i]+" ");
		}

	}

}
//sysout+ctrl+space