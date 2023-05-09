package arrayMajorityElement;

import java.util.Arrays;

public class MajorityElementEx1 {
public static void main(String args[]) {
	int[] nums = {3,2,3};
	 Arrays.sort(nums);
	 int len = nums.length;
	 int largestNumber = nums[len -1];
	 System.out.println("The Majority Element in the array is: "+largestNumber);
}
}
