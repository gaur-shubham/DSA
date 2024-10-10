public class MinDiff{
	
	public static int calcuateDiff(int[] arr){
		int totalSum = 0;
		for(int n : arr){
			totalSum += n;
		}
		
		int firstSum = 0;
		int minDiff = Integer.MAX_VALUE;
		for(int n =1; n <arr.length; n++ ){
			firstSum += arr[n-1];
			int x = totalSum - firstSum;
			minDiff = Math.min(minDiff, Math.abs(n-x));
		}
		return minDiff;
	
	}
	
	public static void main(String[] args){
		int[] arr = {1,1,3};
		
		System.out.println(calcuateDiff(arr));
	}

}