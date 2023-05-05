package NonDuplicateArray_Assignment;

public class NonDuplicateArrayEx3 {
	public static void main(String[] args) {

	    int result =0;
	    int []arr={1};
	    for(int i:arr)
	    {
	        result ^=i;
	    }

	    System.out.println("The Non Duplicate Array Value is: "+result);
	}
}
