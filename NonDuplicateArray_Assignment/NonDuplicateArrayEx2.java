package NonDuplicateArray_Assignment;

public class NonDuplicateArrayEx2 {
	public static void main(String[] args) {

	    int result =0;
	    int []arr={4,1,2,1,2};
	    for(int i:arr)
	    {
	        result ^=i;
	    }

	    System.out.println("The Non Duplicate Array Value is: "+result);
	}
}
