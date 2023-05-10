package printDuplicateValueNo;

import java.util.Arrays;

public class DuplicateNo3 {
	public static void main(String args[]) {
		int[] arr = {1,1,1,3,3,4,3,2,4,2};
		boolean duplicateArray = false;
		Arrays.sort(arr);
		for(int i =0;i<arr.length;i++) {
			for(int j =i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					duplicateArray = true;
					System.out.println("Duplicate in the array is:" +duplicateArray+" "+arr[i]);
				}
				
			}
			
		}
		if(duplicateArray == false) {
			System.out.println("There is no Duplicate value in array: "+duplicateArray);	
		}
	}
}
