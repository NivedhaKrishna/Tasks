package selenium_day5Assignment;

public class Automation extends MultipleLangauge {

	@Override
	public void ruby() {
		System.out.println("MultipleLangaugeclass in java unimplementation in Automation class in ruby method");
		
	}
	public void Selenium() {
		System.out.println("TestTool class in java unimplementation in Automation  class in Selenium method ");
	}
	public void java() {
		System.out.println("Language class in java unimplementation in Automation  class in java method");
		
	}
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.java();
		auto.Selenium();
		auto.python();
		auto.ruby();
	}
	

}
