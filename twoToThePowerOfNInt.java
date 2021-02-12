package recursion;

public class twoToThePowerOfNInt {

	public static void main(String[] args) {
	System.out.print(powerOfTwo(6));

	}
	public static long powerOfTwo(int n) {
		int result = 1;
		for(int i = 1; i<=n; i++) {
			result = result*2;
		}
		return result;
	}
}
