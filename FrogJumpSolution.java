import java.util.Arrays;

public class FrogJumpSolution{
	
	public static int solution(int X, int[] arr){
		
		boolean[] trackArr = new boolean[X+1];
		int occuredPositionCounter = 0;
		
		int i = 0 ;
		for( i = 0 ; i < arr.length ; i++){
			System.out.print(i+" ");
			if(trackArr[arr[i]] == false){
				trackArr[arr[i]] = true;
				occuredPositionCounter++;
			}
			if(occuredPositionCounter == X){
				break;
			}
			
		}
		
		return occuredPositionCounter == X ? i : -1;
	}

	public static void main(String[] args){
		int[] arr = {1,1,1,2,1,1};
		int X = 3;
		
		System.out.println("\n Solution: "+solution(X,arr));
	}
}