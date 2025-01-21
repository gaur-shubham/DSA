//Seach Suggestions - Amazon

import java.util.*;
public class SearchSuggestion{
	
	//Binary Search: Easier to implement, works well for smaller datasets.
	//Time: O(NlogN + L * logN), space: O(L), where L is the length of searchWord.
	static List<List<String>> BinarySearchApproach(String[] products, String searchWord){
		List<List<String>> productsList = new ArrayList<>();
		Arrays.sort(products);
		int start = 0;
		String prefix = "";
		int N = products.length;
		for(char c : searchWord.toCharArray()){
			prefix += c;
			
			start = lowerBound(products, start, prefix);
			
			List<String> suggestions = new ArrayList<>();
			for(int i = start; i < N && suggestions.size() < 3; i++){
				if(products[i].startsWith(prefix)){
					suggestions.add(products[i]);
				}else{
					break;
				}
			}
		productsList.add(suggestions);
		}
		return productsList;
	}
	
	// Helper function to perform binary search
	static int lowerBound(String[] products, int start, String prefix){
		int low = start, high = products.length;
		while(low < high){
			int mid = (low + high) / 2;
			if(products[mid].compareTo(prefix) < 0){
				low = mid +1;
			}else{
				high = mid;
			}
		}
		return low;
	}
	
	//Time: O(NlogN + L * N), Space: O(L)
	static List<List<String>> suggestedProducts(String[] products, String searchWord){
		List<List<String>> productsList = new ArrayList<>();
		Arrays.sort(products); // O(nlogn)
		for(int i = 1 ; i <= searchWord.length(); i++){ //O(N)
		List<String> currList = new ArrayList<>();
			for(String word : products){ // O(M)
				if(word.startsWith(searchWord.substring(0,i))){
					currList.add(word);
				}
				if(currList.size() >= 3) break;
			}
			productsList.add(currList);
		}
		return productsList;
	}
	
	public static void main(String arr[]){
		String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
		String searchWord = "mouse";
		
		List<List<String>> productsList =BinarySearchApproach(products, searchWord);//suggestedProducts(products, searchWord);
		
		for(List<String> l : productsList){
			System.out.println(l);
		}
	}
}

/* LEETCODE : MEDIUM LEVEL QUESTION
1268. Search Suggestions System
You are given an array of strings products and a string searchWord.

Design a system that suggests at most three product names from products after each character of searchWord is typed. Suggested products should have common prefix with searchWord. If there are more than three products with a common prefix return the three lexicographically minimums products.

Return a list of lists of the suggested products after each character of searchWord is typed.

 

Example 1:

Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
Output: [
["mobile","moneypot","monitor"],
["mobile","moneypot","monitor"],
["mouse","mousepad"],
["mouse","mousepad"],
["mouse","mousepad"]
]

*/