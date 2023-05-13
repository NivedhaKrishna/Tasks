package org.system_day5Assignment;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Desktop Class -> desktopSize Method");
	}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.computerModel();
	d.desktopSize();
}
}
