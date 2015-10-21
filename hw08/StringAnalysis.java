/*
Alex Spitzer
CSE2
Enter String, checkfor letters
*/
import java.util.Scanner;

public class StringAnalysis{
    public static boolean charCheck(String allLetters){
        boolean allAreChar = true;
        for (int i=1; i<allLetters.length(); i++){
            //compare individual characters.  if value is too small, or too big, reject it.
            char charAtI = allLetters.charAt(i);
            if ('a' >= charAtI || charAtI >= 'z'){
                allAreChar = false;
                break;
            }
        }
        return (allAreChar);
    }
    public static boolean charCheck(String allLetters, int charNum){
        boolean allAreChar = true;
        //almost identical to above, with a different cap to read up to.
        for (int i=1; i<charNum; i++){
            char charAtI = allLetters.charAt(i);
            if ('a' >= charAtI || charAtI >= 'z'){
                allAreChar = false;
                break;
            }
        }
        return (allAreChar);
    }
    public static void main(String[]args){
        //ask for string
        System.out.println("Please enter a string of characters.");
        Scanner myScanner = new Scanner( System.in );
        String input = myScanner.next();
        //ask how much (all or select)
        System.out.println("All characters, or a certain number? (If all, type yes.  Otherwise, type no.)");
        String certainNumber = myScanner.next();
        
        if (certainNumber.equals("yes")){
            //if all, run it
            boolean isIt = charCheck(input);
            System.out.println("grfevd " + isIt);
        } else {
            //if not, ask how many, then run it
            System.out.println("How many characters?");
            int readLength = myScanner.nextInt();
            boolean isIt = charCheck(input, readLength);
            System.out.println("grfevd " + isIt);
        }
        
    }
}