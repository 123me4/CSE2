public class Arithmetic{
    
    //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //(‘$’ is part of the variable name)
    double sockCost$=2.58;

    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;

    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    
    //  print the requested information
    public static void main (String[] args) {
        double sockPrice$=nSocks*sockCost$;
        System.out.println( sockPrice$ );
        
    }
}