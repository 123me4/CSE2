public class circleTest{
    
    public static void main(String[] args) {
        int[] matrix = {5,10,15,20,25};
        //circleSwap(matrix);
        shuffle(matrix);
        printArray(matrix);
        
        minSelectionSort(matrix);
        printArray(matrix);
        
        maxSelectionSort(matrix);
        printArray(matrix);
        
    }
    
    public static void circleSwap( int[] array){
        int end = array[array.length - 1];
        for (int i=array.length - 1; i>0; i--){
            array[i] = array[i - 1];
        }
        array[0] = end;
    }
    
    public static void printArray( int[] array){
        for (int j=0; j<array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println("");
    }
    
    public static void minSelectionSort( int[] array){
        
        for(int i=0; i<array.length; i++){
            int min = 1000;
            int minPos = 0;
            for(int j=i; j<array.length; j++){
                if(min>array[j]){
                    min = array[j];
                    minPos = j;
                }
            }
            array[minPos] = array[i];
            array[i] = min;
            //printArray(array);
        }
    }
    
    public static void maxSelectionSort( int[] array){
        
        for(int i=0; i<array.length; i++){
            int max = -1000;
            int maxPos = 0;
            for(int j=i; j<array.length; j++){
                if(max<array[j]){
                    max = array[j];
                    maxPos = j;
                }
            }
            array[maxPos] = array[i];
            array[i] = max;
            //printArray(array);
        }
    }
    
    public static void shuffle(int[] list){
        for (int i=0; i<list.length; i++){
            //chose a random target
            int target = (int)(list.length*Math.random());
            //swap value i with value target
            int temp = list[target];
            list[target] = list[i];
            list[i] = temp;
            //adapted from lecture18
        }
        //return list;
    }
}