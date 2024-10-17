import java.util.*;

public class WorkdayProblemB{

	public List<String> triangleType(List<String> triangleToy){
		List<String> result = new ArrayList<>();
		
		for(String triangle : triangleToy){
			
			String[] sideStr = triangle.split(" ");
			List<Integer> sides = new ArrayList<>();

			for(String side : sideStr){
				sides.add(Integer.parseInt(side));
			}
			
			//Collections.sort(sides);
			
			if(sides.get(0) + sides.get(1) > sides.get(2)){
				if(sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2)){
					result.add("Equilateral");
				}else if(sides.get(0) == sides.get(1) || sides.get(1) == sides.get(2)){
					result.add("Isosceles");
				}else{
					result.add("None of these");
				}
			}else{
				result.add("None of these");
			}
		}
		
		return result;
	}
	
	public static void main(String[] args){
	WorkdayProblemB wb = new WorkdayProblemB();
	List<String> triangleToy = new ArrayList<>();
	triangleToy.add("2 2 1");
	triangleToy.add("3 3 3");
	triangleToy.add("3 4 5");
	triangleToy.add("1 1 2");
	triangleToy.add("1 1 1");
	triangleToy.add("1 1 3");
	triangleToy.add("1 2 3");
	triangleToy.add("4 4 3");
	
	System.out.println("Result: " + wb.triangleType(triangleToy));
	}
}