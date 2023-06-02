package Java_Interview_Question;

import java.util.HashSet;
import java.util.Set;

public class UniqueElement {
    public static void main(String[] args) {
        int[] nums =  {1,2,3,4,5};
        int duplicate = 0;
        for(int i =0; i< nums.length; i++) {
            for(int j =i+1; j< nums.length; j++){
                if(nums[i]==nums[j]){
                   duplicate = nums[i];
                   System.out.println(duplicate);

                }
            }
        }
        int sum =0;
        for(int i =0; i< nums.length; i++){
            if(duplicate!=nums[i]){
                System.out.println("Unquie value: "+nums[i]);
                sum = sum + nums[i];
            }
        }
        System.out.println(sum+" Sum of the Unquie value");



    }
}
