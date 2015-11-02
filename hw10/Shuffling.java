//Alex Spitzer
//CSE2
//Card shuffling with methods
import java.util.Scanner;

public class Shuffling{
    public static void main(String[] args) {
        //this block was copy-pasted from assignment.
        Scanner scan = new Scanner(System.in);
	    //suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        for (int i=0; i<52; i++){
            cards[i]=rankNames[i%13]+suitNames[i/13];
            System.out.print(cards[i]+" ");
        }
        System.out.println("");
        //copy-paste ends here
        
        cards = shuffle(cards); //shuffle the cards
        System.out.println("Shuffled: ");
        printList(cards);   //print the shuffled deck
        System.out.println("Hand: ");
        hand = randomizeHand(cards);    //deal out a hand
        printList(hand);    //print the hand
    }
    public static void printList(String[] list){
        for (int i=0; i<list.length; i++){
            //print out elements of given array
            System.out.print(list[i] + " ");
        }
        //format
        System.out.println("");
    }
    public static String[] shuffle(String[] list){
        for (int i=0; i<list.length; i++){
            //chose a random target
            int target = (int)(list.length*Math.random());
            //swap value i with value target
            String temp = list[target];
            list[target] = list[i];
            list[i] = temp;
            //adapted from lecture18
        }
        return list;
    }
    public static String[] randomizeHand(String[] list){
        //make an empty hand
        String[] hand = new String[5];
        for (int i=0; i<hand.length; i++){
            //fill empty hand by dealing out cards from deck
            hand[i] = list[(5 * i) + 0];    //the 5 means your playing w/ 5 people
                                            //the 0 means your the first one dealt
            //System.out.print(hand[i] + " ");
        }
        //System.out.println("");
        return hand;
    }
}