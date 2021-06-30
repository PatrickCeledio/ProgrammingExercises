/*
    Patrick Celedio Intro to Java Prog. and Data Struct. 12th Ed

    1.12 (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hours, 40 minutes, and 35 seconds
    Write a program that displays the average speed in kmh
    1 mi = 1.6 km
 */
public class AverageSpeedInKilometers {
    public static void main(String[] args){
        System.out.println("Given a runner runs 24 miles in 1 hour, 40 min, and 35 sec\n The average speed of " +
                "that in kmh is: " + ((24.0*1.6)) / ( 1.0 + (40.0/60.0) +  ((35.0/60.0) / (60.0)) )  + " kmh");
    }
}
