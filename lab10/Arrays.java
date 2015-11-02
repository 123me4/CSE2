import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {
        int number = (int)(6*Math.random() + 5);
        String[] students = new String[number];
        Scanner myScanner = new Scanner( System.in );
        System.out.println("Enter " + number + " student names:");
        for (int i=0; i<number; i++){
            students[i] = myScanner.next();
        }
        System.out.println("\nHere are the midterm grades of the " + number + " students above:");
        int[] midTerms = new int[number];
        for (int i=0; i<number; i++){
            midTerms[i] = (int)(101*Math.random());
            System.out.println(students[i] + ": " + midTerms[i]);
        }
        
    }
}