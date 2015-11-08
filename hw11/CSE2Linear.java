import java.util.Scanner;

public class CSE2Linear{
    public static void main(String[] args) {
        //make the array
        int[] array1 = new int[15];
        //i don't want to input 15 values, so i randomized it.
        array1[0] = (int) (25*Math.random());
        for (int i=1; i<array1.length; i++){
            array1[i] = array1[i - 1] + 1 + (int) (10*Math.random());
        }
        //print array (so i know what to look for)
        printArray(array1);
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an int to search for: ");
        int listValue = scan.nextInt();
        // run the search.  the third input, true, means the array is sorted. 
        int[] searchReturn = linearSearch(array1, listValue, true);
        //the search returns a 2-value long array with the iteration # and whether
        //the value was found or not.
        
        //print
        if (searchReturn[0] == 0){
            System.out.println(listValue + " was not found in the list with " + searchReturn[1] + " iterations");
        }else{
            System.out.println(listValue + " was found in the list with " + searchReturn[1] + " iterations");
        }
        //scramble
        scrambler(array1);
        
        //repeat the above (mostly)
        searchReturn = linearSearch(array1, listValue, false);
        
        System.out.print("Scrambled: ");
        if (searchReturn[0] == 0){
            System.out.println(listValue + " was not found in the list with " + searchReturn[1] + " iterations");
        }else{
            System.out.println(listValue + " was found in the list with " + searchReturn[1] + " iterations");
        }
    }
    
    public static void printArray(int[] list){
        for (int i=0; i<list.length; i++){
            System.out.println("" + list[i]);
        }
    }
    
    public static int[] linearSearch(int[] list, int target, boolean sorted){
        int i=0;
        //make returned array
        int[] answer = new int[2];
        answer[0] = 0;
        for (i=0; i<list.length; i++){
            if (list[i] == target){
                // if found, say so
                answer[0] = 1;
                break;
            }
            if (sorted && list[i] > target){
                // if sortand and too big, stop.
                break;
            }
        }
        answer[1] = i;
        return answer;
    }
    
    public static void scrambler(int[] list){
        //shuffle it around
        for (int i=0; i<list.length; i++){
            int place = (int)(list.length*Math.random());
            int temp = list[place];
            list[place] = list[i];
            list[i] = temp;
        }
        
    }
}