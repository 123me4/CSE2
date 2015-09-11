//Alex Spitzer
//9/11/15
//110

//obtain check amount
//add tip (user % choice)
//split check

import java.util.Scanner;

public class Check{
    // main method required for every Java program
   	public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        // ask important questions
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble();
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): " );
        double tipPercent = myScanner.nextDouble();
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        double totalCost;
        double costPerPerson;
        
        totalCost = checkCost * (1 + (tipPercent/100.0));
        costPerPerson = totalCost / numPeople;
        int dollars, pennies, dimes; // for decimal places
        dollars=(int)costPerPerson;
        dimes=(int)(costPerPerson * 10) % 10; // *10, truncate, find remainder
        pennies=(int)(costPerPerson * 100) % 10; // *100, truncate, find remainder
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
    }  //end of main method   
} //end of class
