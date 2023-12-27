
public class Reverse {
	public static void main (String[] args){
	String text = args[0] ;
	// length of text
	int l = text.length() ;
    for (int i = (l-1); i >= 0; i-- ){
    	System.out.print(text.charAt(i));
    }
    System.out.println();
	// the middle chr 
	int mid = l / 2 ; 
	if ( l % 2 == 0){
		mid = mid - 1;
	}   
	// print the mid char
    System.out.println("The middle character is " + text.charAt(mid));
	}
}
