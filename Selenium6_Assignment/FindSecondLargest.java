package Selenium6_Assignment;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7,8};
		
		Set<Integer> setBig = new TreeSet<Integer>();
		for(int i : data) {
			System.out.println("List Values are: "+i);
			setBig.add(i);
		}
		System.out.println("Set Values are "+setBig);
		Arrays.sort(data);
		int len = data.length;
		int res = data[len-2];
		System.out.println("The Second Largest Number in data: "+	res);
	}
	}