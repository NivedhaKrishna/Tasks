package Selenium6_Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber {
	public static void main(String[] args) {
		int[] data = {3,2,10,4,6,7,2,3,3,6,7,1,8,9};
		Set<Integer> h = new LinkedHashSet<Integer>();
		for(int i : data) {
			System.out.println("List Values are: "+i);
			h.add(i);
		}
		System.out.println("Set Values are: "+h);
		ArrayList arrayList = new ArrayList(h);

		// sorting the list
		Collections.sort(arrayList);

		System.out.println("Ascending Order in List: "+arrayList);
		for(int i =1; i<= arrayList.size(); i++) {
			if(!arrayList.contains(i)) {
				System.out.println("Missing value is: "+i);
			}
		}
	}
}
