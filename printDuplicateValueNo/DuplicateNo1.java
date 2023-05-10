package printDuplicateValueNo;

import java.util.Arrays;

public class DuplicateNo1 {
	public static void main(String args[]) {
		int[] arr = {1,2,3,1};
		boolean duplicateArray = false;
		Arrays.sort(arr);
		for(int i =0;i<arr.length;i++) {
			for(int j =i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					duplicateArray = true;
					System.out.println("Duplicate in the array is:" +duplicateArray);
				}
				
			}
			
		}
		if(duplicateArray == false) {
			System.out.println("There is no Duplicate value in array: "+duplicateArray);	
		}
	}
}
