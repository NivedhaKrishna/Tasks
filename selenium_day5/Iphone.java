package selenium_day5;

public class Iphone extends IOS {
	public void  makeCall() {
		System.out.println("makeCall in Iphone");
		
	}
	public void  sendSMS() {
		System.out.println("makeCall in Iphone");
		
	}
	public static void main(String[] args) {
		Iphone phone = new Iphone();
		phone.startApp();
		phone.increaseVolume();
		phone.shutDown();
		phone.makeCall();
		phone.sendSMS();
	
	}
}
