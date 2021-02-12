package recursion;

public class xToThePowerOfNint {

	public static void main(String[] args) {
	System.out.print(powerX(6, 3));
	}
	
	public static int powerX(int x, int n) {
		int result = 1;
		for(int i = 1; i<=n; i++) {
			result = result*x; 
		}
		return result;
	}

}
