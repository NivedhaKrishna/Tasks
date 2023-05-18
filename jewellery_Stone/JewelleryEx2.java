package jewellery_Stone;

public class JewelleryEx2 {

	public static void main(String[] args) {
		String  jewels = "z", stones = "ZZ";
		int result =0;
		for(int i =0; i<jewels.length(); i++) {
			for(int j =0; j<stones.length(); j++) {
				if(jewels.charAt(i)== stones.charAt(j)) {
					result++;
				}
			}
		}
		System.out.println(result);//No extra value

	}

}
