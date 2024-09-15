package firstLab;

import java.util.Arrays;

public class SadikArraySorting {

	public static void main(String[] args) {
		int[] numbers = { 5, 2, 9, 1, 5, 6 };
		int n=numbers.length;
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(numbers[i]>numbers[j]) {
					int temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}

        }
        System.out.println("Sorted array: " + Arrays.toString(numbers));
	}
}
