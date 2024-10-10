import java.util.*;

public class SumArray{
	
	
	public static void main(String[] args){
	int[] arr =  {3, 4, 7, 2, -3, 1, 4, 2};
	int k = 7;
	HashMap<Integer, Integer> freq = new HashMap<>();
	
	freq.put(0,1);
	
	int sum = 0;
	int ans = 0;
	for(int j = 0; j< arr.length; j++){
		sum += arr[j];
		
		if(freq.containsKey(sum-k)){
			ans += freq.get(sum-k);
		}
		
		if(freq.containsKey(sum)){
			freq.put(sum, freq.get(sum)+1);
		}else{
			freq.put(sum,1);
		}
	}
	
	System.out.println(ans);
	
	}
}