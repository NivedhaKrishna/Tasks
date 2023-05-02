package String_Assignment;

public class StrAss1 {
	public static void main(String args[]) {
		String str = "Hello World";
		String[] words=str.split("\\s");
		 
		for(String w:words){  
		
		if(w.equals("World")) {
			System.out.println("World length: "+w.length());  
		}
		
		}
	}
}
