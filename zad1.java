package recursion;

public class zad1 {

public static void main(String[] args) {
	System.out.println("Sum is " + xMethodIntearative(5));
	}
 
public static int xMethodIntearative(int n) {
int result = 0;
for(int i = 0; i<=n; i++) {
	result =result + i;
}
return result;
}
}