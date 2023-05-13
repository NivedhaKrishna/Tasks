package selenium_day5Assignment;

public class Students {
	
	public void getStudentInfo() {
		System.out.println("Students Class -> getStudentInfo Method");
	}
	public void getStudentInfo(int id,int phone) {
		System.out.println("Students Class -> getStudentInfo Method id and phone value is : "+id+" "+phone);
	}
	public void getStudentInfo(String name, String email) {
		System.out.println("Students Class -> getStudentInfo Method name, email value is : "+name+" "+email);
	}
	public static void main(String[] args) {
		Students s= new Students();
		s.getStudentInfo();
		s.getStudentInfo(02,123456789);
		s.getStudentInfo("TestLeaf", "test@gmail.com");
	}
}
