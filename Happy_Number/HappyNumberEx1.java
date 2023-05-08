package Happy_Number;

import java.util.Scanner;


public class HappyNumberEx1 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = s.nextInt();
		int sum =0;
		int d;
		int f =n;
		while(f>9) {
			while(f>0) {
				d =f%10;
				sum =sum+(d*d);
				f= f/10;	
			}

			System.out.println(sum);
			f= sum;
			sum =0;
			
		}
		if(f==1) {
			System.out.println(n+" is Happy Number");
		}else {
			System.out.println(n+"is Not a Happy Number");

		}
		
	}
}
