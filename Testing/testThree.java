public class testThree{
    public static void main(String[]args){
        
        String[] array = {"A","B","C","D","E","F","G","H","I","J"};
        int i, j;
        for(i=1; i<=9; i++){
            for(j=i; j>0; j--){
            	System.out.printf("" + array[j - 1]+" ");
            }
            System.out.println("");
        }

        
    }
}