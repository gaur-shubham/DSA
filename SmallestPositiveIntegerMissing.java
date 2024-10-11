import java.util.*;

public class SmallestPositiveIntegerMissing{
	
	public static int solution(int[] arr){
	int arrayLength = arr.length; 
	boolean[] numOccured = new boolean[arrayLength + 1];
	for(int i = 0; i < arrayLength; i++){
		if(arr[i] > 0 && arr[i] <= arrayLength){
			numOccured[arr[i]] = true;
		}
	}
	System.out.println(arrayLength+">>>" +Arrays.toString(numOccured)+" : "+numOccured.length);
	int number = 1;
	for(; number< numOccured.length; number++){
		if(!numOccured[number]){
			return number;
		}
	}
	
	return arrayLength+1;
	}
	
	//
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		
		System.out.println("missing smallest integer: "+solution(arr));
	
	}
}

/*
QUESTION:

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000]

*/