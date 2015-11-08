/*
*/
import java.util.Scanner;

public class Search{
    public static void main(String[] args) {
        int[] array1= new int[5000];
        int[] array2= new int[5000];
        array1[0] = (int) (10001*Math.random());
        array2[0] = 1 + (int)(10*Math.random());
        
        for (int i=1; i<5000; i++){
            array1[i] = (int) (10000*Math.random());
            array2[i] = array2[i - 1] + 1 + (int)(100*Math.random());
        }
        
        int linMax = linearMax(array1);
        System.out.println("The maximum of array1 is: " + array1[linMax]);
        int linMin = linearMin(array1);
        System.out.println("The minimum of array1 is: " + array1[linMin]);
        
        linMax = linearMax(array2);
        System.out.println("The maximum of array2 is: " + array2[linMax]);
        linMin = linearMin(array2);
        System.out.println("The minimum of array2 is: " + array2[linMin]);
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int listValue = scan.nextInt();
        
        if (listValue > 0){
            int newCheck = 0;
            int i;
            for(i=1; i<13; i++){
                if (array2[newCheck] < listValue){
                    newCheck += (array2.length/(2*i));
                    
                }
                else if (array2[newCheck] > listValue){
                    newCheck -= (array2.length/(2*i));
                }
                else{
                    break;
                }
            }
            System.out.println(array2[newCheck] + "");
        }
    }
    
    public static int linearMax(int[] list) {
        int max = 0;
        for (int i=1; i<list.length; i++){
            if (list[i] > list[max]){
                max=i;
            }
        }
        return max;
    }
    
    public static int linearMin(int[] list) {
        int min = 0;
        for (int i=1; i<list.length; i++){
            if (list[i] < list[min]){
                min=i;
            }
        }
        return min;
    }
    
    public static int binarySearch(int[] list, int target){
        int newCheck = 0;
        for(int i=1; i<13; i++){
            if (list[newCheck] < target){
                newCheck += (list.length/(2*i));
                
            }
            else if (list[newCheck] > target){
                newCheck -= (list.length/(2*i));
            }
            else{
                return newCheck;
            }
        }
        return -1;
    }
}