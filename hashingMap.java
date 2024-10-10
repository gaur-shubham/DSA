import java.util.*;

public class hashingMap{

	public static void majorityElement(int[] nums){
		HashMap<Integer, Integer> freqMap = new HashMap<>();
		int no = nums.length;
		for(int n : nums){
			if(freqMap.containsKey(n)){
				freqMap.put(n, freqMap.get(n)+1);
			}else{
				freqMap.put(n, 1);
			}
		}
		
		for(int key : freqMap.keySet()){
			if(freqMap.get(key)> no/3){
				System.out.println(key);
			}
		}
	}
	public static void main(String[] args){
	int[] nums = {1,2,5,5,5,5,5,5,5};
	majorityElement(nums);
	}
}