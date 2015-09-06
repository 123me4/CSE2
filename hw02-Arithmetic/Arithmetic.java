//Alex Spitzer
//9/6/15
//Sectioin 110

public class Arithmetic{
    
    //  print the requested information
    public static void main (String[] args) {
        //Number of pairs of socks
        int numSocks=3;
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
        
        //prices and printing
        double sockPrice$=numSocks*sockCost$;
        System.out.println( "Socks cost $" + sockPrice$ );
        double glassPrice$=nGlasses*glassCost$;
        System.out.println( "Drinking glasses cost $" + glassPrice$);
        double envelopePrice$=nEnvelopes*envelopeCost$;
        System.out.println( "Envelopes cost $" + envelopePrice$);  
        double taxlessCostOfPurchase$=sockPrice$+glassPrice$+envelopePrice$;
        System.out.println( "The total price (without tax) is $" + taxlessCostOfPurchase$);
        //tax and printing
        double sockSaleTax$=(int)(sockPrice$*taxPercent*100) / 100.0;
        System.out.println( "Sock sales tax is $" + sockSaleTax$ );
        double glassSaleTax$=(int)(glassPrice$*taxPercent*100) / 100.0;
        System.out.println( "Glass sales tax is $" + glassSaleTax$ );
        double envelopeSaleTax$=(int)(envelopePrice$*taxPercent*100) / 100.0;
        System.out.println( "Envelopes sales tax is $" + envelopeSaleTax$ );
        double totalCostOfPurchase$=(int)((taxlessCostOfPurchase$+sockSaleTax$+glassSaleTax$+envelopeSaleTax$)*100) / 100.0;
        //double totalCostOfPurchase$=(int)(totalCostOfPurchase$*100) / 100.0;
        System.out.println( "The total price is $" + totalCostOfPurchase$);
    }
}