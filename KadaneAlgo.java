// kadane Algorithm for maximum sub array sum problem

import java.util.*;
public class KadaneAlgo{
	
	// brute force apprach with O(n^2) 
	public static int bruteForceApproach(int[] arr){
		int n = arr.length;
		int maxSum = Integer.MIN_VALUE;
		for(int start = 0; start < n; start++){
			int currSum = 0;
			for(int end = start; end < n; end++){
				currSum += arr[end];
				maxSum = Math.max(currSum, maxSum);
			}
		}
		
		return maxSum;
		
	
	}
	
	// optimied with O(n) complexity
	public static int kadaneSolution(int[] arr){
		int n = arr.length;
		
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0 ;
		for(int i = 0 ; i < n; i++){
			currSum += arr[i];
			maxSum = Math.max(currSum, maxSum);
			
			if(currSum < 0){
				currSum = 0 ;
			}
		}
		
		return maxSum;
	}
	
	public static void main(String[] args){
		int[] arr = {2, 3, -8, 7, -1, 2, 3};
		System.out.println("BRUTE FORCE: "+bruteForceApproach(arr));
		System.out.println("KADANE ALGO: "+kadaneSolution(arr));
	}
}