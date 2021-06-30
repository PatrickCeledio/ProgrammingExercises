/*
    Patrick Celedio Intro to Java Prog. and Data Struct. 12th Ed

    1.10 Assume that a runner runs 14 km in 45 min and 30 sec.
    Write a program that displays the average speed in miles per hour.
    (1 mile == 1.6 km and mph = km/h ÷ 1.609344 and divide time value by 60 to get the value in hours)
 */
public class AverageSpeedInMiles {
    public static void main(String[] args){
        System.out.println("Given a runner runs 14 km in 45 min and 30 sec.\n"
        + "The average speed of that time converted to miles per hour is: " + (14/1.6) + " miles and " +
                ((30/60) + 45.0)/(60) + " hours which equates to " + (14/1.6)/(((30/60) + 45.0)/(60)) +
                " mph.");

    }
}
