import java.util.*;

public class WorkdayProblemA{

	public int lastWeight(List<Integer> weights){
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int weight : weights){
			maxHeap.add(weight);
		}
		
		while(maxHeap.size() > 1){
			int stone1 = maxHeap.poll();
			int stone2 = maxHeap.poll();
			
			if(stone1 != stone2){
				maxHeap.add(stone1 - stone2);
			}
			
		}
		return maxHeap.isEmpty() ? 0 : maxHeap.poll();
	}
	
	public static void main(String[] args){
		WorkdayProblemA wa = new WorkdayProblemA();
		List<Integer> weights = List.of(1, 2, 3, 6, 7, 7);
		
		System.out.println(wa.lastWeight(weights));
	}
}