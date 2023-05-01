package Selenium_day2assignment;

public class SumOfDigitsFromString {
	
	public static void main(String args[]) {
        String str1 = "Tes12Le79af65";
        
        char[] c = str1.toCharArray();

        int sum = 0;

        for (int i = 0; i < c.length; i++) {

            if (Character.isDigit(c[i])) {

                System.out.print("Digits in the String : " + c[i]);
                System.out.println();

                int a = Integer.parseInt(String.valueOf(c[i]));

                sum = sum + a;

            }

        }
        System.out.println("Sum of Digits is : " + sum);

	}
}
