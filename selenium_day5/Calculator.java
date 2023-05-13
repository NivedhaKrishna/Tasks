package selenium_day5;

public class Calculator {

	public void add(int a, int b) {
	System.out.println("add method with int type: "+a+b);
	}
	public void add(int a, int b, int c) {
	System.out.println("add method with int type: "+a+b+c);
	}
	public void multiple(double a, double b) {
		System.out.println("Multiple method with double type: "+a*b);
		}
	public void multiple(float a, float b) {
		System.out.println("Multiple method with float type: "+a*b);
		}
	public static void main(String[] args) {
		Calculator p = new Calculator();
		p.add(2, 3);
		p.add(1, 2, 3);
		p.multiple(2.343, 2.323);
		p.multiple(2.4, 2.4);
	}
}
