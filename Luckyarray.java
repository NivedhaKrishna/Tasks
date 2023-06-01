package Java_Array_Concepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Luckyarray {
    public static int findLucky(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (h.containsKey(arr[i])) {
                h.put(arr[i], h.get(arr[i]) + 1);
            } else {
                h.put(arr[i], 1);
            }
        }
        int x = 0;
        int max = -1;
        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                x = entry.getValue();
                max = Math.max(x, max);

            }
        }
        return max;
    }



    public static void main(String[] args) {
        int [] arr = {2,2,2,3,3};
        int [] arr1 = {1,2,2,3,3,3};
        int [] arr2 = {2,2,3,4};
        System.out.println(findLucky(arr));
        System.out.println(findLucky(arr1));
        System.out.println(findLucky(arr2));
    }
}

