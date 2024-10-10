public class UnpairedElements{
	
	public static int unpairedElement(int[] arr){
		int n = 0;
		
		for(int x : arr){
			n ^= x;
		}
		
		return n;
	}
	
	public static void main(String[] args){
		int[] arr = {9, 3, 9, 3, 9, 7, 9, 7, 6, 5, 4, 5, 6};
		
		System.out.println("Unpaired Element : "+unpairedElement(arr));
		
	}
}