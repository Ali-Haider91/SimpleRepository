package Assignment2;

public class AddFunc {
	
	public static long Factorial(int n) {
	if(n==0) {
		return 1;    
	}else {
		return n*Factorial(n-1);
	}
	}
	
	
}
