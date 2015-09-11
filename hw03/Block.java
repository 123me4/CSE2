//Alex Spitzer
//110

//enter box dimentions
//calc volume and SA
//print values
import java.util.Scanner;

public class Block{
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        // ask important questions
        System.out.print("Enter the length: ");
        double length = myScanner.nextDouble();
        System.out.print("Enter the width: ");
        double width = myScanner.nextDouble();
        System.out.print("Enter the hight: ");
        double hight = myScanner.nextDouble();
        
        // calculations
        double volume, surfaceArea;
        volume = length * width * hight;
        surfaceArea = 2 * (length * width) + 2 * (length * hight) + 2 * (width * hight);
        
        System.out.println("The volume of the box is " + volume + ".");
        System.out.println("The surface area of the box is " + surfaceArea + ".");

    }
}