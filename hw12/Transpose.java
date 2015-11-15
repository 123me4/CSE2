//Alex Spitzer
//CSE2

import java.util.Scanner;

public class Transpose{
    
    public static void main(String[] args) {
        //make matrix define it w/ method, define size with other methods
        int[][] matrix1 = randomMatrix(x(), y());
        //print
        printArray(matrix1);
        //transpose
        int[][] matrix2 = transposeMatrix(matrix1);
        //print
        printArray(matrix2);
    }
    
    public static int x(){
        Scanner scan = new Scanner(System.in);
        //enter int, return int.
        System.out.print("Enter the matrix width: ");
        int x = scan.nextInt();
        return x;
    }
    
    public static int y(){
        Scanner scan = new Scanner(System.in);
        //enter int, return int.
        System.out.print("Enter the matrix height: ");
        int y = scan.nextInt();
        return y;
    }
    
    public static void printArray(int[][] array){
        //find initial sub-array size
        int checkSize = array[0].length;
        for (int k=1; k<array.length - 1; k++){
            //compare to all others.
            if (array[k].length != checkSize){
                //if not all equal, warn.
                System.out.println("Warning: not rectangular array.");
                break;
            }
        }      
        //copy-paste from lab12 (still prints ragged arrays)
        System.out.println("");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static int[][] randomMatrix(int x, int y){
        //make array of given sizes
        int[][] array = new int[x][y];
        for (int i=0; i<x; i++){
            for (int j=0; j<y; j++){
                //set all values between -10 to 10
                array[i][j] = (int)(21*Math.random()) - 10;
            }
        }
        return array;
    }
    
    public static int[][] transposeMatrix(int[][] matrix){
        //make transposed-sized array
        int[][] array = new int [matrix[0].length][matrix.length];
        for (int i=0; i<array.length ; i++){
            for (int j=0; j<array[0].length ; j++){
                //set each value to corresponding transposed value
                array[i][j] = matrix[j][i];
            }
        }
        return array;
    }
}