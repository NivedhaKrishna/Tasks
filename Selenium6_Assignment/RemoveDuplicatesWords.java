package Selenium6_Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String textchange = text.toLowerCase();
		System.out.println("Original String with duplicate Words: "+textchange);
		String[] allwords = textchange.split(" ");
		String remove ="";
		for(int i=0; i<allwords.length; i++) {
			for(int j=i+1; j<allwords.length; j++) {
				if(allwords[i].equals(allwords[j])) {
					allwords[j] = remove;
				}
			}
		}
		String result ="";
		Set<String> h = new LinkedHashSet<String>();
		// Convert to String
		for(String word: allwords) {
			if(word != remove) {
				result = result + word + " ";
					
			}
		}
		//Set 
		h.add(result);

		// Display given String after removing duplicates
		System.out.println("\nSentence after removing duplicate words: " + h);

	}
}
