package combination;

public class Combination_lib {
	
	public int getFactorial(int n) {
		int i=1;
		int f = 1;
		
		while(i <= n) {
			f*=i;
			i++;
		} 
		return f;
	}

}
