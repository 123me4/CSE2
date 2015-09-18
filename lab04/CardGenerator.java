//Alex Spitzer
//CSE2

//pick random 1-52
//1-13 = diamond
//14-26 = clubs
//27-39 = hearts
//40-52 = spades
//# values for cards.  Ace = 1 King = 13
public class CardGenerator{
    public static void main(String[] args) {
        int anyCard = (int) (Math.random()*52);
        String cardSuit;
        //System.out.println(anyCard);
        if (anyCard <= 13){
            cardSuit = "Diamonds";
        }
        else if  (anyCard <= 26){
            cardSuit = "Clubs";
        }
        else if (anyCard <= 39){
            cardSuit = "Hearts";
        }
        else{
            cardSuit = "Spades";
        }
        //System.out.println(cardSuit);
        
        int cardValue = anyCard%13;
        //System.out.println(cardValue);
        String cardNumber = "0";
        
        switch (cardValue){
        case 1:
            cardNumber = "Ace";
        break;
        case 2:
            cardNumber = "2";
        break;
        case 3:
            cardNumber = "3";
        break;
        case 4:
            cardNumber = "4";
        break;
        case 5:
            cardNumber = "5";
        break;
        case 6:
            cardNumber = "6";
        break;
        case 7:
            cardNumber = "7";
        break;
        case 8:
            cardNumber = "8";
        break;
        case 9:
            cardNumber = "9";
        break;
        case 10:
            cardNumber = "10";
        break;
        case 11:
            cardNumber = "Jack";
        break;
        case 12:
            cardNumber = "Queen";
        break;
        case 0:
            cardNumber = "King";
        break;
        }
        System.out.println("You picked the " + cardNumber + " of " + cardSuit);
    }
}