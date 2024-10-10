import java.util.HashSet;
import java.util.Iterator;

public class hashing{
	public static void main(String[] args){
		HashSet<Integer> setttt = new HashSet<>();
		
		for(int i = 0; i < 4; i++){
			setttt.add(i);
		}
		
		System.out.println(setttt.contains(1));
		System.out.println(setttt.contains(5));
		
		System.out.println(setttt);
		
		Iterator it = setttt.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next()+" ");
		}
	
	}
}