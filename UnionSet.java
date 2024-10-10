import java.util.*;

public class UnionSet{
	
	public static void mergeArrays(int[] arr1, int[] arr2){
		HashSet<Integer> set = new HashSet<>();
		
		for(int n : arr1){
			set.add(n);
		}
		
		for(int n : arr2){
			set.add(n);
		}
		
		System.out.println(set.size());
	}
	
	public static int intersection(int[] arr1, int[] arr2){
		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		for(int n : arr1){
			set.add(n);
			
		}
		
		for(int n : arr2){
			if(set.contains(n)){
				count++;
				set.remove(n);
			}
			
			
		}
		
		return count;
		
	}
	
	public static void main(String[] args){
		int[] arr1 = {7,3,9};
		int[] arr2 = {6,3,9,2,9,4};
		
		mergeArrays(arr1,arr2);
		System.out.println(intersection(arr1,arr2));
	}
}