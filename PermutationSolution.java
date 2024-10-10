public class PermutationSolution{

	public static int solution(int[] arr){
		int arrlength = arr.length;
		boolean[] number = new boolean[arrlength+1];
		
		for(int i = 0; i< arrlength; i++){
			
		if(arr[i] < 1 || arr[i] > arrlength){
				return 0;
		}
		if(number[arr[i]]){
			return 0;
		}
		
		number[arr[i]] = true;
		}
		
		return 1;
		
	}
	public static void main(String[] args){
		int[] arr = {1,4,1};
		
		System.out.println(solution(arr));
	}
}