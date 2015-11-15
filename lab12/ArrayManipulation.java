//Alex Spitzer


public class ArrayManipulation{
    public static void main(String[] args) {
        int[][] someList = raggedArray();
        System.out.println("2D array:");
        printArray(someList);
        System.out.println("\nSmallest member array:");
        printArray(findSmallest(someList));
        System.out.println("\nLargest value & it's member array:");
        printArray(findLargest(someList));
        System.out.println("\nMost even values in member array:");
        printArray(mostEven(someList));
    }
    
    public static int[][] raggedArray(){
        int[][] array = new int[(int)(11*Math.random()) + 10][];
        for(int i=0; i<array.length; i++){
            array[i] = new int[(int)(11*Math.random()) + 10];
            for(int j=0; j<array[i].length; j++){
                array[i][j] = (int)(2001*Math.random()) - 1000;
            }
        }
        return array;
    }
    
    public static void printArray(int[][] array){
        System.out.println("");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void printArray(int[] array){
        System.out.println("");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + "");
            System.out.println("");
        }
    }
    
    public static int[] findSmallest(int[][] array){
        int size = 21;
        int place = 0;
        for(int i=0; i<array.length; i++){
            if (array[i].length<size){
                size = array[i].length;
                place = i;
            }
        }
        return array[place];
    }
    
    public static int[] findLargest(int[][] array){
        int size = -1001;
        int member = 0;
        //int place = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if (array[i][j]>size){
                    size = array[i][j];
                    member = i;
                }
            }
        }
        System.out.println("\n" + size);
        return array[member];
    }
    
    public static int[] mostEven(int[][] array){
        int even = 0;
        
        int member = 0;
        for(int i=0; i<array.length; i++){
            int tempEven = 0;
            for(int j=0; j<array[i].length; j++){
                if (array[i][j]%2 == 0){
                    tempEven++;
                }
            }
            if (tempEven>even){
                even = tempEven;
                member = i;
            }
        }
        return array[member];
    }
}