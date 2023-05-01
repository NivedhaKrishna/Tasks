package Selenium_day2assignment;
	
public class ChangeOddIndexToUpperCase {
public static void main(String args[]) {
	String s = "changeme";
	String word =" ";
	for(int i=0;i<s.length();i++) 
	{ 
		char ch=s.charAt(i);	
		System.out.println("Character "+ch);
		if(i%2==0)			
		ch=Character.toUpperCase(ch); 
		System.out.println("Change Character "+ch);

		word=word+ch;	
	} 
	System.out.println("Required String : "+word);  
}
}


//