package charIndex;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Index {
	 static char findRepeat(char temp[]) 
	    { 
	        ArrayList<Character> list = new ArrayList<Character>(); 
	  
	         
	        for (int i=0; i<=temp.length-1; i++) 
	        { 
	            char ch = temp[i]; 

	             
	            // Checks for repeated character 
	            if (list.contains(ch)) 
	                return ch; 
	            
	            //Adds unique character to the list
	            else 
	                list.add(ch); 
	        } 
	  
	        //Returns False in case of no repetition
	        return 'F'; 
	    } 
	  
	    public static void main (String[] args) 
	    { 
	       
	        String str = "abcdd"; 
	        
	        //string to char array for processing
	        char[] charr = str.toCharArray();
	        
	        //Prints in case of no repetition
	        if (findRepeat(charr)=='F')
	        System.out.println("NO REPETITION");
	 
	        //Prints the repeated character        
	        else
	        System.out.println("The First Repeated Character in the String is: "+findRepeat(charr)); 
	    } 
}
