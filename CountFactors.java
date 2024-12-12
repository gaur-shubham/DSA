public class CountFactors{
	
	public static int solution(int N){
		int count = 0; 
		// instead of running loop till N, running till sqrt(N) or N^(1/2) 
		for(long i = 1; i * i <= N; i++){
			// count the i and its counter part as well. (24/6 = 4) counting for both 6 and 4.
			
			if(N%i == 0){
				count++;
				if(i != N/i){
					count++;	
				}
			}
		}
		
		return count;
	
	}
	
	public static void main(String[] args){
		int N = 24;
		
		System.out.println(solution(N));
	}
}


/*
EASY 
QUESTION: Count factors of given number n.

A positive integer D is a factor of a positive integer N if there exists an integer M such that N = D * M.

For example, 6 is a factor of 24, because M = 4 satisfies the above condition (24 = 6 * 4).

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the number of its factors.

For example, given N = 24, the function should return 8, because 24 has 8 factors, namely 1, 2, 3, 4, 6, 8, 12, 24. There are no other factors of 24.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].
*/