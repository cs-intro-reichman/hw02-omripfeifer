import java.util.Random;

public class OneOfEachStats {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);
        Random generator = new Random (seed);
        // number of familys with 2 k
        int k2 = 0;
        // number of familys with 3k 
        int k3 = 0;
        // number of familys with 4k
        int k4 = 0;
        // most com familys 
        int ck = 0;
        // in case of ck=4 
        String ormore = "";
        // sum k of all familys
        double sumt = 0;
        // avg family
        double avg = 0;
// loop until i = t
        for (int i = 1; i <= T; i++) {
            int sumb = 0;
            int sumg = 0;

// until I have at least one "b" and one "g" and the total count is less than or equal to t
            while ((sumb < 1 || sumg < 1) && (sumb + sumg <= T)) {
                double a = generator.nextDouble();
                if (a >= 0.5) {
                    sumb++;
                } else {
                    sumg++;
                }
            }

            int sum = sumb + sumg;
            sumt += sum;

            if (sum == 2) {
                k2++;
            } else if (sum == 3) {
                k3++;
            } else {
                k4++;
            }
// define ck as the right family
            if ( k2 >= k3 && k2 >= k4 ) {
                ck = 2;
            } else if( k3 >= k4 ){
                ck = 3;
                } else {
                    ck = 4 ;
                    ormore = " or more";
                }
            
        }

        avg = sumt / T;

        System.out.println("Average: " + avg + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + k2);
        System.out.println("Number of families with 3 children: " + k3);
        System.out.println("Number of families with 4 or more children: " + k4);
        System.out.println("The most common number of children is " + ck + ormore + ".");
    }
}
