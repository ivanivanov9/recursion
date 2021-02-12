package recursion;

public class xToThePowerOfN {

		public static void main(String[] args) {
		System.out.print(powerX(6, 3));
	}
		public static int powerX(int x, int n) {
			if(n == 0) {
				return 1;
			}
			return x*powerX(x, n-1);
		}

	}
