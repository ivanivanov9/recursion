package recursion;

public class desetichnoKumDvoichno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(desToDv(17));

	}
	
	public static String desToDv(int n) {
		if (n == 1) {
			return "1";
		}
		return desToDv(n / 2) + n % 2;
	}

}
