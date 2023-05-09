package arrayMajorityElement;

import java.util.Arrays;

public class MajorityElementEx2 {
	public static void main(String args[]) {
		int[] nums = {2,2,1,1,1,2,2};
		 Arrays.sort(nums);
		 int len = nums.length;
		 int largestNumber = nums[len -1];
		 System.out.println("The Majority Element in the array is: "+largestNumber);
	}
}
