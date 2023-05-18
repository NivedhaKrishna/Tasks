package jewellery_Stone;

public class JewelleryEx1 {
	public static void main(String[] args) {
		int result =0;
		String jewels = "aA", stones = "aAAbbbb";
		for(int i = 0; i<jewels.length(); i++) {
			for(int j =0; j<stones.length(); j++) {
				if(jewels.charAt(i)== stones.charAt(j)) {
					result++;
					
				}
			}
			
		}
		System.out.println(result);//bbb 
	}

}
