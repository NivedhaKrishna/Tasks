package Selenium_day2assignment;

public class ReverseEvenWords {

	public static void main(String args[]) {
		String test = "I am a software tester"; 
		String[] words=test.split("\\s"); 
		
		for(String w:words){  
		System.out.println(w);  
		} 
		for(int i = 0; i<words.length;i++) {
			for(int j = 0; j<words.length;j++) {
			if(i % 2 != 0 ) {
				System.out.println("Odd one: "+words[i]);
				System.out.println(" ");
				 if(j%2 == 0)
				        System.out.println("Even one: "+words[j]);
				 ReverseEvenWords re = new ReverseEvenWords();
				 re.reverseWordInMyString("ReverseEvenWords:  "+words[j]);
				 System.out.println(" ");
				    }  
			}
				}
							
					
}
	public void reverseWordInMyString(String str)
	   {
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	   }
		
	}

