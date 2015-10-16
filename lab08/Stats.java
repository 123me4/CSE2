/*
Alex Spitzer
CSE2
methods for mean, and median
*/

import java.util.Scanner;

public class Stats{
    //average method
    public static double mean (double a, double b, double c, double d, double e){
        double mean = (a + b + c + d + e) / 5;
        return(mean);
	}
	//middle method
	public static double median (double a, double b, double c, double d, double e){
        return(c);
	}
    public static void main(String[]args){
        System.out.println("Please input increasing double values.");
        Scanner myScanner = new Scanner( System.in );
        //make an array.  it has 6 values: 0-6.  0 = 0  this helps the code when comparing
        //values, and forces all numbers to be positive. (negative numbers are just confusing)
        double[] values = new double[6];
        values[0] = 0;
        for (int i=1; i<6; i++){
            //ask for input
            System.out.printf("#" + i + ": ");
            values[i] = myScanner.nextDouble();
            // if input is smaller than previous, repeat until otherwise.
            if (values[i]<values[i - 1]){
                System.out.println("The number must be bigger than the previous.  Try again.");
                i--;
            }
            //System.out.println("");
        }
        
        // find and print mean
        double average = mean(values[1], values[2], values[3], values[4], values[5]);
        System.out.println("Mean: " + average);
        // find and print median
        double middle = median(values[1], values[2], values[3], values[4], values[5]);
        System.out.println("Median: " + middle);
        
    }
}
