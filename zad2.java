package recursion;

public class zad2 {


public static void main(String[] args) {
   	 xMethodIntearative(1234567);
}

public static void xMethodIntearative(int n) {
	while(n>0) {
		System.out.print(n % 10);
  		 n /= 10;
	}
}
}