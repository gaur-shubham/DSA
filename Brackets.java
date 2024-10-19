import java.util.Stack;

public class Brackets{
	
	public static int solution1(String s){
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()){
			
			if(c == '(' || c == '{' || c == '['){
				stack.push(c);
			}else{
				if(stack.isEmpty()){
					return 0;
				}
				
				char top = stack.pop();
				if(
				(c == '}' && top != '{') ||
				(c == ']' && top != '[') ||
				(c == ')' && top != '(')
				){
					return 0;
				}
			}
			
			
			
		}
	
	return stack.isEmpty() ? 1 : 0;
	}
	
	
	public static int solution2(String s){
		
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0 ; i < s.length(); i++){
			char c = s.charAt(i);
			if( c == '('){
				stack.push(c);
			}else{
				if(!stack.isEmpty()){
					stack.pop();
				}else{
					return 0;
				}
			}
		}
		return stack.isEmpty() ? 1 : 0;
	}
	
	public static void main(String[] args){
	//String for question 1 (multiple type parenthese)
	String s = "{{{}}}";
	
	System.out.println("MULTIPLE type parentheses NESTING: "+solution1(s));
	
	
	//String for question 2 (Single type parenthese)
	String s1 = "";
	System.out.println("SINGLE type parentheses NESTING: "+solution2(s1));
	
	}
}


/*
EASY
QUESTION 1: Determine whether a given string of parentheses (multiple types) is properly nested.

A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..200,000];
string S is made only of the following characters: '(', '{', '[', ']', '}' and/or ')'.

===========================================================================================================================


EASY
QUESTION 2: Determine whether a given string of parentheses (single type) is properly nested.

A string S consisting of N characters is called properly nested if:

S is empty;
S has the form "(U)" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, string "(()(())())" is properly nested but string "())" isn't.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.

For example, given S = "(()(())())", the function should return 1 and given S = "())", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..1,000,000];
string S is made only of the characters '(' and/or ')'.
*/



