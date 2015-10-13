//Alex Spitzer
//CSE2
/* print (with variable size):
 *****
* *** *
** * **
*** ***
** * **
* *** *
 *****
*/
import java.util.Scanner;

public class encrypted_x{
    public static void main(String[]args){
        Scanner myScanner = new Scanner( System.in );
        int x;
        while(true){
            System.out.printf("Please enter an integer between 1-100: ");
            x = myScanner.nextInt();
            if (x>0 && x<101){
                break;
            }else{
                //System.out.printf("Please enter an integer between 1-100: ");
            }
        }
        for (int i=0; i<=x; i++){
            for (int j=0; j<=x; j++){
                if (j == (x - i) || j == i){
                    System.out.printf(" ");
                }else{
                    System.out.printf("*");
                }
                    
            }
            System.out.printf("\n");
        }
    }
}