package selenium_day5;

public class Samsung extends AndroidTV {

	public void openApp() {
		System.out.println("OpenApp in Samsung ");
		
	}

	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("playVideo in Samsung ");
	}
	@Override
	public void Movie() {
		System.out.println("Movie in AndroidTV");
		
	}
public static void main(String[] args) {
	Samsung s = new Samsung();
	s.watchMovie();
	s.openApp();
	s.playVideo();
	s.Movie();
}




}
