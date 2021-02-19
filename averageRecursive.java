package recursion;

public class averageRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1, 2, 3, 4};
		System.out.print(average(list,4));
	}
	
	public static double average(int[] array, int n) {
		return sum(array, n, 0) / n;
	}
	
	public static double sum(int[] array, int n, int result) {
		if(n==0) {
			return result;
		}
		return sum(array, n - 1, result + array[n - 1]);
	}

}
