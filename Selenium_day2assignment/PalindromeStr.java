package Selenium_day2assignment;

public class PalindromeStr {
	
	public static void main(String args[]) {
		String s ="madam";
		String revString ="";
		for (int i = s.length()-1; i >=0 ; i--) 
			revString=revString+s.charAt(i);
		
		if(s.equals(revString))
			System.out.println("String is palindrome "+revString);
		else 
			System.out.println("String is not palindrome "+revString);

	
	}

}
