
public class Sortwordsentence {

	 public static void main(String args[]) {
         String s ="is2 sentence4 This1 a3";
       String[] words = s.split(" ");
       String[] senArr = new String[words.length];
       StringBuilder sb = new StringBuilder();
       
       // reorder all the words and remove the number of each word
       for (int i = 0; i < words.length; i++) {
           senArr[Character.getNumericValue(words[i].charAt(words[i].length() - 1)) - 1] 
               = words[i].substring(0, words[i].length() - 1);
       }
       
       // put all the words together
       for (int i = 0; i < senArr.length; i++) {
           sb.append(senArr[i]);
           sb.append(' ');
       }
       
       // remove the white space of the last word
       System.out.println(sb.toString().trim());   
   }

}
