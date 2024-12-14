//Element occuring more the n/2 in array

import java.util.Arrays;

public class MooresVotingAlgorithm{
	
	// Brute force solution comparing each element's frequency greater than n/2. TIME COMPLEXITY: O(n^2)
	public static int bruteForce(int[] arr){
		int n = arr.length;
		
		for(int i = 0; i < n; i++){
			int frequency = 0;
			int currElement = arr[i];
			for(int j = 0; j < n; j++){
				if(currElement == arr[j]){
					frequency++;
				}
			}
			
			if(frequency > n/2){
				return arr[i];
			}
		}
		
		return -1;
		
	}
	
	//use sorting to make the approach more optimized. we first sort the array and then find the frequency.TIME COMPLEXITY: O(nlogn)
	public static int optimizedApproach(int[] arr){
		int n = arr.length;
		Arrays.sort(arr); // Sorting array
		int currElement = arr[0];
		int frequency = 1 ;
		
		for(int i = 1 ; i < n; i++){
			if(currElement == arr[i]){
				
				frequency++;
			}else{
				
				frequency = 1;
				currElement = arr[i];
			}
			
			if(frequency > n/2){
				
				return currElement;
			}
		}
		
		return -1;
		
	}
	
	// Moore's approach: If an element occurs more than n/2 times, it will always survive the elimination process when you compare and cancel out other elements. TIME COMPLEXITY: O(n)
	public static int MooresSolution(int[] arr){
		int frequency =0, ans = 0;
		int n =arr.length;
		
		for(int i = 0 ; i < n; i++){
			if(frequency == 0){
				ans = arr[i];
			}
			
			if(ans == arr[i]){
				frequency++;
			}else{
				frequency--;
			}
		}
		int count = 0 ;
		for(int i = 0; i < n; i++){
			if(arr[i] == ans){
				count++;
			}
		}
		
		return (count > n/2) ?  ans : -1;
	}
	
	public static void main(String[] args){
		int arr[] = {1,2,2,1,1,1};
		//int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		
		System.out.println("Brute Force Approach: "+bruteForce(arr));
		System.out.println("Sorted Optimized Approach: "+optimizedApproach(arr));
		System.out.println("Moores Algo: "+MooresSolution(arr));
		
	}
}