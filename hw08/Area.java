/*
Alex Spitzer
CSE2
calc area of rectangle, triangle or circle.
*/
import java.util.Scanner;

public class Area{
    public static void decideOnShape (String shape){
        Scanner myScanner = new Scanner( System.in );

        double area = 0;
        if (shape.equals("rectangle")){
            // ask important things, then run correct calc.
            System.out.println("What is the width?");
            double width = myScanner.nextDouble();
            System.out.println("What is the hight?");
            double hight = myScanner.nextDouble();
            area = rectArea(width, hight);
        }else if (shape.equals("triangle")){
            // ask important things, then run correct calc.
            System.out.println("What is the bade length?");
            double width = myScanner.nextDouble();
            System.out.println("What is the hight?");
            double hight = myScanner.nextDouble();
            area = triArea(width, hight);
        }else {
            // ask important things, then run correct calc.
            System.out.println("What is the radius?");
            double radius = myScanner.nextDouble();
            area = cirArea(radius);
        }
        System.out.println("The area is " + area);
    }
    public static double rectArea (double width, double hight){
        return(width*hight);
    }
    public static double triArea (double width, double hight){
        return(width*hight/2);
    }
    public static double cirArea (double radius){
        return(3.14159*radius*radius);
    }
    
    public static void main(String[]args){
        System.out.println("What shape would you like to find the area of?");
        Scanner myScanner = new Scanner( System.in );
        String shapeName;
        while (true){
            //ask until good
            shapeName = myScanner.next();
            if (shapeName.equals("rectangle") || shapeName.equals("triangle") || shapeName.equals("circle")){
                break;
            } else {
                System.out.println("Please input a shape. (triangle, rectangle, or circle)");
            }
        }
        decideOnShape(shapeName);
        
    }
}