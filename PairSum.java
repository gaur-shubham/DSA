// Pair sum problem: sum of any two elements in a SORTED array. 

public class PairSum{
	
	//brute force approach
	public static int[] bruteForce(int[] arr, int target){
		int size = arr.length;
		
		for(int i = 0; i < size; i++){
			
			for(int j = i+1; j < size; j++){
				int currSum = arr[i] + arr[j];
				if(target == currSum){
					return new int[]{i,j};
				}
			}
		}
		return null;
	}
	
	//two pointer approach  ***IMPORTANT*** : two pointer approach is for sorted array only.
	public static int[] twoPointerSolution(int[] arr, int target){
		int i = 0, j = arr.length-1;
		
		while(i < j){
			int currSum = arr[i] + arr[j];
			if(target < currSum){
				j--;
			}else if(target > currSum){
				i++;
			}else{
				return new int[]{i,j};
			}
		}
		
		return null;
	}
	
	
	public static void main(String[] args){
		int[] arr = {2, 7, 11, 15}; // sorted array.
		int target = 9;
		
//		int result[] = bruteForce(arr, target);
		int result[] = twoPointerSolution(arr, target);
		
		if(null != result){
			System.out.println(result[0]+" "+result[1]);
		}
		
	}
}