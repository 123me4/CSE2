public class binarySearchTest{
    public static void main(String[] args) {
        //System.out.println("" + Math.pow(2, 3));
        int[] array = new int[15];
        for(int i=0; i<array.length; i++){
            array[i] = 4*i + (int)(3 * Math.random());
            System.out.println(i + ": \t" + array[i]);
        }
        int target = 13;
        int check = 0;
        int i;
        boolean found = false;
        for(i=1; i<5; i++){
            int qwerty = target - array[check];
            if (qwerty < 0){
                check -= array.length / Math.pow(2, i);
            }else if (qwerty > 0){
                check += array.length / Math.pow(2, i);
            }else{
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Target: " + target + " Place in array: " + check + " iterations: " + i);
        }else{
            System.out.println("Target: " + target + " In between: " + check + " and " + (check + 1) + " iterations: " + i);
        }
    }
}