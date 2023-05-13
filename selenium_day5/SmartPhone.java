package selenium_day5;

public class SmartPhone extends AndroidPhone {
	public void takeVideo(String phone) {
		System.out.println("Take Method in SmartPhone "+phone);
		}
	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		s.takeVideo("Args in smartphone");
		s.takeVideo();
		
	}
}

