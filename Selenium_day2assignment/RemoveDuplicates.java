package Selenium_day2assignment;

public class RemoveDuplicates {
	public static void main(String args[]) {
		String text = "We learn java basics as part of java sessions in java week1";	
//		int count;
		boolean flag = false;
		int index =0;
		String[] words=text.split("\\s");
		System.out.println(words);
		for(String w:words){  
		System.out.println(w);  
		
		}
		for (int i = 0; i <= words.length - 1; i++) {

		   
			if (text.contains(words[i])) {
		        flag = true;
		        index = i;
		       
		    }
		
		}
		if(flag) 
			System.out.println("Duplicate Index value:  " + index);
			else 
			   System.out.println("not found ");
		
	}

}
