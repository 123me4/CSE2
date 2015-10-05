//Alex Spitzer
//CSE2

//input barcode
//evaluate barcode
//compare to check digit
//give feedback
import java.util.Scanner;
import java.util.regex.Pattern; //Used to compare a string and see if it fits as a double
//found here: http://tutorials.jenkov.com/java-regex/pattern.html#pattern-matches

public class CheckDigit{
     public static void main(String[]args){
        //----------------------------------------------------------------------
        //This whole thing was was taken from here: 
        //http://docs.oracle.com/javase/6/docs/api/java/lang/Double.html#valueOf%28java.lang.String%29
        //for converting strings to doubles.
        final String Digits     = "(\\p{Digit}+)";
        final String HexDigits  = "(\\p{XDigit}+)";
        // an exponent is 'e' or 'E' followed by an optionally 
        // signed decimal integer.
        final String Exp        = "[eE][+-]?"+Digits;
        final String fpRegex    =
            ("[\\x00-\\x20]*"+  // Optional leading "whitespace"
             "[+-]?(" + // Optional sign character
             "NaN|" +           // "NaN" string
             "Infinity|" +      // "Infinity" string

             // A decimal floating-point string representing a finite positive
             // number without a leading sign has at most five basic pieces:
             // Digits . Digits ExponentPart FloatTypeSuffix
             // 
             // Since this method allows integer-only strings as input
             // in addition to strings of floating-point literals, the
             // two sub-patterns below are simplifications of the grammar
             // productions from the Java Language Specification, 2nd 
             // edition, section 3.10.2.

             // Digits ._opt Digits_opt ExponentPart_opt FloatTypeSuffix_opt
             "((("+Digits+"(\\.)?("+Digits+"?)("+Exp+")?)|"+

             // . Digits ExponentPart_opt FloatTypeSuffix_opt
             "(\\.("+Digits+")("+Exp+")?)|"+

       // Hexadecimal strings
       "((" +
        // 0[xX] HexDigits ._opt BinaryExponent FloatTypeSuffix_opt
        "(0[xX]" + HexDigits + "(\\.)?)|" +

        // 0[xX] HexDigits_opt . HexDigits BinaryExponent FloatTypeSuffix_opt
        "(0[xX]" + HexDigits + "?(\\.)" + HexDigits + ")" +

        ")[pP][+-]?" + Digits + "))" +
             "[fFdD]?))" +
             "[\\x00-\\x20]*");// Optional trailing "whitespace"
        //--------------------------------------------------------------------------------------------------------------------------------------------------------
        
        
        
        
        
        
        
        
        
        
        //Here's my code
        Scanner myScanner = new Scanner( System.in );
        System.out.printf("Please enter a 10 digit barcode: ");
        while (true){
            String barCodeString = myScanner.next();
            //System.out.println("" + barCodeString);
            int barCodeLength = barCodeString.length();
            //System.out.println("" + barCodeLength);
            int[] barCodeDigits = new int[10];
            boolean isThereX;
            if (barCodeString.charAt(9) == 'X'){
                //System.out.println("yes");
                barCodeString = barCodeString.substring(0,9)+'0';
                //System.out.println("" + barCodeString);
                isThereX = true;
            }else{
                //System.out.println("no");
                isThereX = false;
            }
            
            if (barCodeLength == 10){
                
                if (Pattern.matches(fpRegex, barCodeString)){
                    double barCodeNumber = Double.valueOf(barCodeString);
                    int BCN = (int) barCodeNumber;
                    //System.out.println("" + BCN);
                    for (int i=0; i<10; i++){
                        int modBy = 10;
                        barCodeDigits[9 - i] = BCN % modBy;
                        BCN = BCN / 10;
                        //System.out.println("" + barCodeDigits[9 -i]);
                    }
                    /*for (int i=0; i<10; i++){
                        System.out.printf(barCodeDigits[i] + " ");
                    }
                    System.out.printf("\n");*/
                    
                    int total = 0;
                    for (int i=0; i<9; i++){
                        int delta = barCodeDigits[i]*(10 - i);
                        //System.out.printf(delta + " ");
                        total = total + delta;
                    }
                    System.out.println("\n" + total);
                    int checkDigit = total % 11;
                    if (isThereX == true){
                        barCodeDigits[9] = 10;
                    }
                    if (checkDigit == barCodeDigits[9]){
                        System.out.println("This is a valid ISBN.");
                    }else{
                        if (checkDigit == 10){
                            System.out.println("This is NOT a valid ISBN.  Check digit should be X.");
                        }else{
                            System.out.println("This is NOT a valid ISBN.  Check digit should be " + checkDigit + ".");
                        }
                    }
                    break;
                }else{
                    System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits:");
                }
            }else{
                 System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits:");
            }
        }
     }
}