package selenium_day2;

public class Calculator {
	int c;
	public int add(int a, int b) {
		c= a+b;
		return c;
	}
	public int multiple(int a,int b) {
		c= a*b;
		return c ;
	}
	public void sub() {
		System.out.println("Subtract method");
	}
public static void main(String args[]) {
	Calculator c = new Calculator();
	System.out.println(c.add(2, 2));
	System.out.println(c.multiple(2, 2));
	c.sub();
}
}
