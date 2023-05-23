package ArrayOccurance;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Numberofoccurrences {
	public static boolean checkUniqueFrequency(int[] arr)
    {
       
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        
        Set<Integer> freqSet = new HashSet<Integer>();
 
        // Loop through each element in the array
        for (int i : arr) {
            // Increment element frequency in HashMap
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
 
        // Loop through each frequency in HashMap
        for (int f : freq.values()) {
            // Add frequency to HashSet
            freqSet.add(f);
        }
 
       
        return freqSet.size() == freq.size();
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 1,2,2,1,1,3};
        boolean res = checkUniqueFrequency(arr);
 
        if (res) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
	

}
