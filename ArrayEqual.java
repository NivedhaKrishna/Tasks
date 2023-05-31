
public class ArrayEqual {

	public static void main(String[] args) {
		String[] word1 =  {"ab", "c"};
		String[] word2= {"a", "bc"};
		String w1="";
		String w2="";
		for(int i=0; i<word1.length; i++)
		{
			w1+=word1[i];
			System.out.print(w1);
			
		}
		System.out.print(" " );

		for(int i=0; i<word2.length; i++)
		{
			w2+=word2[i];
			System.out.print(w2);
		}
		System.out.print(" " );

		if(w1.equals(w2))
		{
			System.out.print(true); 
		}
		else
			System.out.print(false); 

	}



}
