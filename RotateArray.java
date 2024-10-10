import java.util.Arrays;

public class RotateArray{
	
	public static int[] reverseArray(int[] arr, int start, int end){
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
		return arr;
	}
	public static int[] rotateRight(int[] arr, int k){
		int length = arr.length;
		k = k % length;
		
		reverseArray(arr, 0, length-1);
		
		reverseArray(arr, 0, k-1);
		
		reverseArray(arr, k, length-1);
		
		return arr;
	}
	
	public static int[] rotateLeft(int[] arr, int k){
		int length = arr.length;
		k = k%length;
		
		reverseArray(arr, 0, k-1);
		reverseArray(arr, k, length-1);
		reverseArray(arr, 0, length-1);
		
		return arr;
	}
	public static void main(String[] args){
		
		int[] arr = {3, 8, 9, 7, 6};
		int k = 8;
		
		System.out.println("original Array: "+ Arrays.toString(arr));
		
		rotateRight(arr, k);
		System.out.println("Rotated Right Array: "+ Arrays.toString(arr));
		
		int[] arr1 = {3, 8, 9, 7, 6};
		int k1 = 2;
		
		System.out.println("original Array: "+ Arrays.toString(arr1));
		
		rotateLeft(arr1, k1);
		System.out.println("Rotated Left Array: "+ Arrays.toString(arr1));

	
	}
}