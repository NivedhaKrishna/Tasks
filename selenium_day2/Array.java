package selenium_day2;

public class Array {

	public static void main(String args[])
	 {
		int[] b = {2,5,7,7,5,9,2,3};
		for(int i =0 ; i<b.length; i++) {
			for(int j = i+1; j<b.length;j++) {
				if(b[i]== b[j] ){
					System.out.println("duplicate value of array "+b[j]);
				}
			}
		}
	}
}
