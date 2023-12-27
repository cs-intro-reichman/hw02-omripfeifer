public class Perfect {
	public static void main (String[] args) {
        int a = Integer.parseInt(args[0]);
        int sum = 0 ;
        String divisor = "";
        for (int i = 1  ; i < a ; i++) {
        if ( a % i == 0){
        	sum += i ;
        	divisor += i + " + ";
        }
    }
        if ( sum == a ){
            divisor = divisor.substring(0,divisor.length() - 2);
        	System.out.println( a + " is a perfect number since " + a + " = " + divisor);
        }
        else{ 
        	System.out.println(a + " is not a perfect number");
        }
		
	}
  }
