public class InOrder {
	public static void main (String[] args) {
		// the first rendom integer
		int a = (int) (Math.random() * 10);
		int b = (int) (Math.random() * 10);
		System.out.print(a + " ");
		// loop, as long as b is >= a than it will continue to generate and print randoms.
		while (b >= a) {
			System.out.print(b + " ");
			a = b;
			b = (int) ( Math.random() * 10);
		}
	}
}
