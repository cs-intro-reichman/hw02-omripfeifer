public class DamkaBoard {
	public static void main(String[] args) {
		// a = number 0f line
		int a = Integer.parseInt( args [0]);
		for ( int b = 1 ; b <= a ; b++ ){
			if ( b % 2 == 0){
			System.out.println( " *".repeat(a));
		} else {System.out.println( "* ".repeat(a)); 
		}
		}
	}
}
