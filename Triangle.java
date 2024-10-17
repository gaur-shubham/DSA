import java.util.Arrays;

public class Triangle{
	
	public static int solution(int[] A){
		int size = A.length;
		if(size < 3){
			return 0;
		}
		
		Arrays.sort(A);
		
		for(int i = 0 ; i < size - 2; i++){
			
			// converting to long just to avoid integer overflow if all three values are Integer.MAX_INT, otherwise it works as expected.
			if((long)A[i]+A[i+1] > A[i+2]){
				return 1;
			}
		}
		
		
		
		return 0;
	
	}
	
	public static void main(String[] args){
	int[] A = {5,3,3};
	
	System.out.println(solution(A));
	}
}



/*
EASY

An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

A[P] + A[Q] > A[R],
A[Q] + A[R] > A[P],
A[R] + A[P] > A[Q].
For example, consider array A such that:

  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
Triplet (0, 2, 4) is triangular.  p = 10, q = 5, r = 8

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.

For example, given array A such that:

  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
the function should return 1, as explained above. Given array A such that:

  A[0] = 10    A[1] = 50    A[2] = 5
  A[3] = 1
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647]
*/