public class Divisors {
	public static void main (String[] args) {
	int x = Integer.parseInt(args[0]);
	int n = 1;
	while ( n <= x){
	if (x % n == 0){  
	System.out.println(n);
	 n++; }
	 else n++;
	    } 
	}
}
