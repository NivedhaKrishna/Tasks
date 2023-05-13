package selenium_day5;

public class OnePlus extends Samsung {
public void phone() {
	System.out.println("Phone in oneplus");
}
public static void main(String[] args) {
	OnePlus s = new OnePlus();
	s.phone();
	s.watchMovie();
	s.openApp();
	s.playVideo();
	s.Movie();
}
}
