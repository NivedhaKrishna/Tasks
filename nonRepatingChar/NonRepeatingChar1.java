package nonRepatingChar;
import java.util.HashMap;
import java.util.Map;


public class NonRepeatingChar1 {

	public static int firstNonRepeatingCharacter(String str) {
	      Map<Character, Integer> characterFrequencyMap = new HashMap<Character, Integer>();
	      char[] chars = str.toCharArray(); 
	      for (char ch : chars) {
	         characterFrequencyMap.put(ch, characterFrequencyMap.getOrDefault(ch, 0) + 1);
	      }

	      for (int i = 0; i < chars.length; i++) {
	         char ch = chars[i];
	         if (characterFrequencyMap.get(ch) == 1) {
	            return i;
	         }
	      }
	      return -1;
	   }

	   public static void main(String[] args) {
		   
		   
	      System.out.println("loveleetcode Value: "+firstNonRepeatingCharacter("loveleetcode"));
	      System.out.println("leetcode Value: "+firstNonRepeatingCharacter("leetcode"));
	      System.out.println("aabb Value: "+firstNonRepeatingCharacter("aabb"));
	      
	   }
	
}