

public class numberFour{
    public static void A(int a){
	    a += 3*a
    }

    public static void B(int b){
	    b -= b * (2 + 1);
    }

    public static void main( String args[] ){
	    int input = 1;
        for( i = 0; i < 3; i++){
            A ( B( input ) );
		    System.out.println( "input: " + input );
        }
    }

}