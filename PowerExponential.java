// optimising the calculation of a^b exponential values. for effective time completixy it should be less than 10^8.

public class PowerExponential{
	
	public static double solution(int a, int b){
		long binForm = b;
		double ans = 1.0;
		
		while(binForm > 0){
			if(binForm %2 ==1){
				ans *= a;
			}
			
			a *= a;
			binForm /= 2;
		}
		
		return ans;
	}
	
	public static double solution2(int base, int power){
		//EDGE CASES
		if(power == 0) return 1.0;
		if(base == 0) return 0.0;
		if(base == 1) return 1.0
		if(power == 1) return base;
		if(base = -1 && power%2 == 0) return 1.0;
		if(base = -1 && power%2 != 0) return -1.0;
		
		// check for powers negative value x^-n is equal (1/x)^n .
		if(power < 0){
			base = 1/base;
			power = -power;
		}
		
		double ans = 1.0;
		
		while(power > 0){
			if(power % 2 == 1){
				ans *= base;
			}
			
			base *= base;
			power /= 2;
			
		}
		
		return ans;
		
	}
	
	public static void main(String[] args){
		int a = 3, b = 13;
		System.out.println("Result: " +solution(a,b));
		System.out.println("Result: " +solution2(a,b));
	}
}