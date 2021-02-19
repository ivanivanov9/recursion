package recursion;

public class oddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(odd(19));

	}
	public static boolean even(int n) {
		if(n == 0) {
			return true;
		}
		else if(n == 1) {
			return false;
		}
		return even(n-2);
	}
	
	public static boolean odd(int n) {
		if(n == 0) {
			return false;
		}
		else if(n == 1) {
			return true;
		}
		return odd(n-2);
	}

}
