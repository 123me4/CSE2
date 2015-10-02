/*
Alex Spitzer
CSE2
lab06

loop a sequence to print multiple numbers up to 7
loop multiple 7's

*/

public class GettingLoopy{
    public static void main(String[]args){
        System.out.println("Step 1:");
        int index = 0;
        while (index < 7){
            System.out.printf("" + index++);
        }
        double repeat = Math.random() * 10;
        while (repeat > 0){
            System.out.printf("7");
            repeat--;
        }
        System.out.printf("\n");
        
        System.out.println("Step 2:");
        int number = 10;
        System.out.println("While loop:");
        while (number <= 100){
            boolean prime = true;
            for (int i = 2; i < number; i++ ){
                if (number % i == 0){
                   prime = false;
                   break;
                }
            }
            if (prime){
                System.out.printf(number + " ");
            }
            number++;
        }
        System.out.printf("\n");
        System.out.println("For loop:");
        for (number = 10; number < 100; number++){
            boolean prime = true;
            for (int i = 2; i < number; i++ ){
                if (number % i == 0){
                   prime = false;
                   break;
                }
            }
            if (prime){
                System.out.printf(number + " ");
            }
            //number++;
        }
        System.out.printf("\n");
        System.out.println("Do While loop:");
        number = 10;
        do{
            boolean prime = true;
            for (int i = 2; i < number; i++ ){
                if (number % i == 0){
                   prime = false;
                   break;
                }
            }
            if (prime){
                System.out.printf(number + " ");
            }
            number++;
        } while (number < 100);
        System.out.printf("\n");
        
        System.out.println("Step 3:");
        int qwerty = 5 + (int)(Math.random() * 196);
        //System.out.println("" + qwerty);
        for (int j = 1; j < qwerty; j++){
            System.out.printf("ツ");
            if (j % 20 == 0){
                System.out.printf("\n");
            }
        }
        System.out.printf("\n");
    }
}