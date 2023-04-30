package selenium_day1;

public class Fibbo {
	
	public static void main(String args[]) {
		int first = 0;
		int last = 1;
		int sum;

		
		for(int i=0;i<11;i++) {
				sum = first + last;
				System.out.println(sum);
				first = last;
				last = sum;
		}
	
}
}
