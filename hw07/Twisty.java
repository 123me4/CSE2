/*
Alex Spitzer
CSE2
#  /\  ##  /\  ##  /\  ##  /\  ##  /\  ##  /\
 #/  \#  #/  \#  #/  \#  #/  \#  #/  \#  #/  
 /#  #\  /#  #\  /#  #\  /#  #\  /#  #\  /#  
/  ##  \/  ##  \/  ##  \/  ##  \/  ##  \/  ##

*/

import java.util.Scanner;

public class Twisty{
    public static void main(String[]args){
        int length;
        
        System.out.printf("Input your desired length: ");
        // find length
        while(true){
            Scanner myScanner = new Scanner( System.in );
            if (myScanner.hasNextInt()) {
                length = myScanner.nextInt();
                if (length > 0 && length < 80){
                    break;
                } else {
                    System.out.printf("Error: length bust be between 0 and 80. ");
                }
            } else {
                System.out.printf("Error: please type in an integer. ");
            }
        }
        int width;
        
        System.out.printf("Input your desired width: ");
        // find width
        while(true){
            Scanner myScanner = new Scanner( System.in );
            if (myScanner.hasNextInt()) {
                width = myScanner.nextInt();
                if (width > 0 && width < length){
                    break;
                } else {
                    System.out.printf("Error: width must be between 0 and " + length + ". " );
                }
            } else {
                System.out.printf("Error: please type in an integer. ");
            }
        }
        
        //System.out.println("length: " + length + "\twidth: " + width);
        for (int i=0; i<width; i++){
            for (int j=0; j<length; j++){
                // find specific points, and mark them
                if (i == (j)%(width * 2)){
                    System.out.printf("#");
                } else if ((1 * width + (i + 0)) == (j)%(width * 2)){
                    System.out.printf("\\");
                } else if ((2 * width - (i + 1)) == (j)%(width * 2)){
                    System.out.printf("#");
                } else if ((1 * width - (i + 1)) == (j)%(width * 2)){
                    System.out.printf("/");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println("");
        }
        
        
    }
}