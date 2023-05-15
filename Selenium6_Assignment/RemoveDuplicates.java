package Selenium6_Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	String string = "PayPal India";

	char[] chars = string.toCharArray();
	Set<Character> charSet = new LinkedHashSet<Character>();
	
	for (char c : chars) {
	    charSet.add(c);
	    
	}
	System.out.println(charSet);
	Set<Character> dupCharSet = new LinkedHashSet<Character>(charSet);
	System.out.println(dupCharSet);
	
	StringBuilder sb = new StringBuilder();
	for (Character character : charSet) {
		
	    sb.append(character);
	}
	System.out.println("Remove the duplicate value: "+sb.toString());
	
}
}
