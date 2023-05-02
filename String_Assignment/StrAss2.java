package String_Assignment;

public class StrAss2 {
	public static void main(String args[]) {
		String s = "fly me to the moon";
		String[] words=s.split("\\s");
		 
		for(String w:words){  
		
		if(w.equals("moon")) {
			System.out.println("moon length: "+w.length());  
		}
		
		}
	}
}
