package String_Assignment;

public class StrAss3 {
	public static void main(String args[]) {
		String s = "luffy is still joyboy";
		String[] words=s.split("\\s");
		 
		for(String w:words){  
		
		if(w.equals("joyboy")) {
			System.out.println("joyboy length: "+w.length());  
		}
		
		}
		
	}
}
