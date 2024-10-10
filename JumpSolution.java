//import java.util.*;

class JumpSolution { 
	public static int solution(int X, int Y, int D){
		int diff = Y - X;
		
		return (int)Math.ceil((double) diff/D);
	}

	public static void main(String[] args){
		int X = 20;
		int Y = 1000000000;
		int D = 30;
		
		System.out.println("jumps: "+solution(X,Y,D));
	}
	
	}