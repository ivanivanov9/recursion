package recursion;

public class twoToThePowerOfN {

	public static void main(String[] args) {
	System.out.print(powerTwo(6));
}
	public static int powerTwo(int n) {
		if(n == 0) {
			return 1;
		}
		return 2*powerTwo(n-1);
	}

}
