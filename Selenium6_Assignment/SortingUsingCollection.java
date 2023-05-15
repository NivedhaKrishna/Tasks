package Selenium6_Assignment;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {
	public static void main(String[] args) {
		String[] stringArray = new String[]{"HCL", "Wipro",  "Aspire Systems", "CTS"};
		int len = stringArray.length;
		System.out.println(len);
		Arrays.sort(stringArray);
		System.out.println(Arrays.toString(stringArray));
		for(int j =stringArray.length-1; j>=0;j--) {
			System.out.println(stringArray[j] );
		}
	}
}

