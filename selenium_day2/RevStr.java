package selenium_day2;

public class RevStr {
public static void main(String args[]) {
	String n ="TestLeaf";
	char[]ch =n.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		System.out.println("Character "+ch[i]);
	}
}
}
