public class PermutationSolution{

	public static int solution(int[] arr){
		int arrlength = arr.length;
		boolean[] number = new boolean[arrlength+1];// To track if each number from 1 to N is seen
		
		for(int i = 0; i< arrlength; i++){
		// Check if the number is out of the expected range [1..N]	
		if(arr[i] < 1 || arr[i] > arrlength){
				return 0;
		}
		// Check if this number has already been seen (i.e., duplicate)
		if(number[arr[i]]){
			return 0;
		}
		// Mark this number as seen
		number[arr[i]] = true;
		}
		// If all checks passed, it is a permutation
		return 1;
		
	}
	public static void main(String[] args){
		int[] arr = {1,4,1};
		
		System.out.println(solution(arr));
	}
}

/*
QUESTION:

A permutation is a sequence containing each element from 1 to N once, and only once.

given an array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [1..1,000,000,000].

*/