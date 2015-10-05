//Alex Spitzer
//CSE2
//Homework 6
import java.util.Scanner;
import java.util.regex.Pattern;
public class BarGraph{
    public static void main(String[]args){
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

        //make arrays because arrays are useful :)
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double[] Expenses = new double[7];
        if (true){
            //scanner for input
            Scanner myScanner = new Scanner( System.in );
            //enter information
            for (int i = 0; i < 7; i++){
                System.out.printf("Expenses for " +dayNames[i]+ ":\t$");
                String checkValid = myScanner.next();
                if (Pattern.matches(fpRegex, checkValid)){
                    double d = Double.valueOf(checkValid);
                    if (d >= 0){
                        Expenses[i] = d;
                    }else{
                        System.out.println("Please input a positive number.");
                        i--;
                    }
                }else{
                    System.out.println("Please input numbers, not letters.");
                    i--;
                }
            }
        }else{
            //random input (for easy tests)
            for (int i = 0; i < 7; i++){
                Expenses[i] = (Math.random() * 20) + 3;
            }
            //print bargraph
            String[] dayNameAbb = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
            for (int i = 0; i < 7; i++){
                System.out.printf( dayNameAbb[i] + ":\t");
                //nested loop for each *
                for (int j = 0; j < Expenses[i]; j++){
                    System.out.printf("*");
                }
                System.out.println("");
            }
        }
        //calculate average
        double wTotal = 0;
        for (int i = 0; i < 7; i++){
            wTotal = wTotal + Expenses[i];
        }
        double average = wTotal / 7;
        System.out.printf("\nAverage weekly expenses: $%.2f", average);
        //find expenses over 4 years
        double[] weeklyExpenses = new double[208];
        weeklyExpenses[0] = average;
        for (int i = 1; i < 208; i++){
            double random = ((Math.random() * 0.4) + 0.8); //random *0.4 = between 0% and 40%.
            //% + 0.8 is for easy math.  multiply by 80%-120%.
            weeklyExpenses[i] = average * random;
        }
        double eTotal = 0;
        //add 'em all up
        for (int i = 0; i < 208; i++){
            eTotal = eTotal + weeklyExpenses[i];
        }
        System.out.printf("\nEstimated expenditure over 4 years: $%.2f\n", eTotal);
    }
}