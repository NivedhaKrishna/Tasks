package ArrayOccurance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class list_word {
	public static void main(String[] args) {
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int len =0;
		for(int i =0; i<sentences.length; i ++) {
			String[] words = sentences[i].split(" ");
			for(String ec: words) {
				System.out.println(ec);
			}
			
			if(words.length>len) {
				len = words.length;
			}
			
		}
		System.out.println(len);
	}

}
