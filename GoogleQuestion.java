import java.util.*;

public class GoogleQuestion{
	
	public static void main(String[] args){
	String s = "%A%_%B%";
	
	HashMap<String, String> values = new HashMap<>();
	values.put("A", "123");
	values.put("B", "435");
	
	for(Map.Entry<String,String> set : values.entrySet()){
		String key = "%" + set.getKey() + "%";
		//System.out.println(key);
		
		s = s.replace(key, set.getValue());
	}
		
	System.out.println(s);
	
	
	}
}

/* 
{"A" -> "123" "B" -> "435"}

"%A%_%B%"

replace values in the template.

*/