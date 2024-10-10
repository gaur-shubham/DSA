import java.util.*;

public class SpiralArray{

	public static void main(String[] args){
	
		int row = 5;
		int col = 6;
		int[][] arr = new int[row][col];
		
		for(int i = 0; i< row; i++){
			for(int j = 0; j < col; j++){
				arr[i][j] = i+j;
				
			}
		}
		
		for(int i = 0; i< row; i++){
			if(i%2 == 0){
			for(int j = 0; j < col; j++){
				System.out.print(arr[i][j]+ " ");
				
			}	
			}else{
				//System.out.print("here");
			for(int j = col; j > 0; j--){
				System.out.print(arr[i][j-1]+ " ");
				
			}	
			}
			
			//System.out.println();
		}
	}
}