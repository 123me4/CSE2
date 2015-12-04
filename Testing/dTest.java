public class dTest{
    public static void main(String[]args){
        int[] array = {1, 2, 3, 4, 5};
        int[] matrix = array;
        for(int j=0; j<5; j++){
           matrix[j] += 1;
        }
        for(int j=0; j<5; j++){
           System.out.printf(array[j] + " ");
        }
        System.out.println("");
    }
}