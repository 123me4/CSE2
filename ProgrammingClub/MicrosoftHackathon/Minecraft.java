//Alex Spitzer

import java.util.Scanner;

public class Minecraft{
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter: ");
        String input = myScanner.nexLine();
        //System.out.print(input);
        int N = Integer.parseInt(input.substring(1, 1));
        int[] arrayRefVar = new int[N ^ 3];
        
        for (int i = 0; i < arrayRefVar.length; i++) {
            arrayRefVar[i] = (int) Integer.parseInt(input.substring(3*(i + 1), 3*(i + 1)+1));
            System.out.print(arrayRefVar[i] + " ");
        }        
        //int output = N*H;
        //System.out.println(output);
    }
}