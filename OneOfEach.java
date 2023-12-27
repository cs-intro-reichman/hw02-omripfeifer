public class OneOfEach {
	public static void main (String[] args) {
		int sumb = 0;
		int sumg = 0;
		String k = "";
		while ( sumb < 1 || sumg <1 ){
			double a =  Math.random();
        if ( a >= 0.5){
			 sumb++;
			 k += " b ";
		} 
		else {
			sumg++;
			k += " g "; 
		}
		a = Math.random();
		}

        System.out.println( k ); 
    int sum = sumb + sumg;
	System.out.println( "You made it... and you now have " + sum + " children.");		
	}
}
