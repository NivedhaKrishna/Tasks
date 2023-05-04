package Palindrome_Assignment;

public class PalindromeEx3 {
	public static void main(String args[]) {
		String s = "A man, a plan, a canal: Panama" ;
		String reverseStr ="";
		
		String orignalval = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("remove all the special Character Original String :"+orignalval);
		
		
		int len = orignalval.length();
			
		for(int i = (len - 1) ; i>=0; --i) {
			reverseStr=	reverseStr + orignalval.charAt(i);

		}
		System.out.println("Reverse String :"+reverseStr);

		System.out.println(orignalval.contains(reverseStr));
		if(orignalval	.toLowerCase().equals(reverseStr.toLowerCase())) {
			 System.out.println(orignalval + " is a Palindrome String.");
		}
		else {
			 System.out.println(orignalval + " is not a Palindrome String.");
		}
		
	}

}
