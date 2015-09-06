// Alex Spitzer
// 9/4/15
// CSE2 110

//print minutes traveled
//print counts of each trip
//print distance of each trip in miles
//print combined distance

//  define a class
public class Cyclometer{

    public static void main (String[] args) {
        //define
        double wheelDiameter=27.0,  //diameter of wheel
        PI=3.14159, //circle constant
        feetPerMile=5280,  //# of feet in 1 mile
        inchesPerFoot=12,   //# of inches in 1 foot
        secondsPerMinute=60;  //# of seconds in 1 minute
        double distanceTrip1, distanceTrip2, totalDistance;  //distances
        int secsTrip1=480;  //time of trip 1
        int secsTrip2=3220;  //time of trip 2
        int countsTrip1=1561;  //wheel revs trip 1
        int countsTrip2=9037; //wheel revs trip 2
        // Print time
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+
        " minutes, and had "+(countsTrip1)+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+
        " minutes, and had "+(countsTrip2)+" counts.");
        //calculation time
        distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; //counts of wheel*wheel size*pi/conversions (inches>miles)
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        //Print time
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }
}