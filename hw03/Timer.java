//Alex Spitzer
//110

//enter current time
//enter target time
//solve for difference in times
import java.util.Scanner;

public class Timer{
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        // ask important questions
        System.out.print("Enter the current time in the form HHMM (military time): ");
        int currentTime = myScanner.nextInt();
        System.out.print("Enter the time of dinner in the form HHMM (military time): ");
        int dinnerTime = myScanner.nextInt();
        //more variables
        int difference = dinnerTime - currentTime;
        int hours, minutes;
        //calculations
        hours = (int) (difference/100.0);
        minutes = difference - hours*100;
        //print out answer
        System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner.");
    }
}