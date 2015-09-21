//Alex Spitzer
//CSE2
public class PokerHandCheck{
    public static void main (String[] args) {
        //pick the random card number
        int anyCard1 = (int) (Math.random()*52);
        int anyCard2 = (int) (Math.random()*52);
        int anyCard3 = (int) (Math.random()*52);
        int anyCard4 = (int) (Math.random()*52);
        int anyCard5 = (int) (Math.random()*52);
        //calculate the suit
        int suit1 = anyCard1 / 13;
        int suit2 = anyCard2 / 13;
        int suit3 = anyCard3 / 13;
        int suit4 = anyCard4 / 13;
        int suit5 = anyCard5 / 13;
        //the number calculated is truncated.  I can input the variable into an 
        //array that has the suit value in it's list.  
        //4/13 = 0 arrayOfSuits[0] = Diamond
        String[] arrayOfSuits = {"Diamonds", "Clubs", "Hearts", "Spades"};
        //I can do the same with the number value of the card.  Remember
        //13 mod 13 = 0, so "King" is in the 0 spot in the array.
        String[] arrayOfNames = {"King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen"};
        int value1 = anyCard1 % 13;
        System.out.print("You have a " + arrayOfNames[value1] + " of " + arrayOfSuits[suit1] +".\n");
        int value2 = anyCard2 % 13;
        System.out.print("You have a " + arrayOfNames[value2] + " of " + arrayOfSuits[suit2] +".\n");
        int value3 = anyCard3 % 13;
        System.out.print("You have a " + arrayOfNames[value3] + " of " + arrayOfSuits[suit3] +".\n");
        int value4 = anyCard4 % 13;
        System.out.print("You have a " + arrayOfNames[value4] + " of " + arrayOfSuits[suit4] +".\n");
        int value5 = anyCard5 % 13;
        System.out.print("You have a " + arrayOfNames[value5] + " of " + arrayOfSuits[suit5] +".\n");
        //System.out.print(" \n");
        //Put all the values into an aray to make comparison easy.
        int[] arrayOfValues = {value1, value2, value3, value4, value5};
        int[] arrayOfCounts = new int[5];
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int j = 0; j < 5; j++){
                if (arrayOfValues[i] == arrayOfValues[j]){
                    count = count + 1;
                    //Whenever the card vaules match, it increases the
                    //count variable.  The more matches, the more/bigger
                    //groups.
                }
            }
            //put the # of groups in an array for easy comparison.
            arrayOfCounts[i] = count;
            //System.out.print(arrayOfCounts[i] + " \n");
        }
        int maximum = arrayOfCounts[0];
        int increment = 0;
        //Find the largest group.  3 of a kind is bigger than a pair.
        for (int i = 0; i < 5; i++) {
            if (arrayOfCounts[i] >= maximum){
                maximum = arrayOfCounts[i];
                increment = increment + 1;
            }
        }
        //System.out.println("\n" + increment +"\n");
        //What to print (based on the maximum group size).
        if (maximum == 1){
            System.out.println("You have a high card hand.");
        }
        else if (maximum == 2){
            if (increment == 4){
                System.out.println("You have a two pair.");
            }
            else{
                System.out.println("You have a pair.");
            }
        }
        else if (maximum >= 3){
            System.out.println("You have a " + maximum + " of a kind.");
        }
        
        
    }
}