public class MissingSolution{
	
	public static int solution(int[] arr){
	int length = arr.length;
	int actualSum = 0;
	for(int n : arr){
		actualSum += n;
	}
	System.out.println(length);
	int expectedSum = ((length+1) * (length+2))/2;
	System.out.println(expectedSum+" :: "+actualSum);
	return expectedSum - actualSum;
	}
	public static void main(String[] args){
	int[] arr = {1,2,3,4,5,6,7,8,9,12,10};
	System.out.println("Missing Element: "+solution(arr));
	}
}