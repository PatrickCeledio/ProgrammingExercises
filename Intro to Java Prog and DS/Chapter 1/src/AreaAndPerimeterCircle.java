/*
    Patrick Celedio Intro to Java Prog. and Data Struct. 12th Ed

    1.8 (Area and perimeter of a circle) Write a program that displays the area and perimeter of a rectangle
    with a width of 4.5 and height of 7.9 using the following formula:
    perimeter = 2 * radius * pi
    area = radius * radius * pi
 */
public class AreaAndPerimeterCircle {
    public static void main(String[] args){
        System.out.println("Given a circle with a width of 4.5 and height of 7.9");
        System.out.println("Perimeter = " + (2.0 * (4.5/2.0) * 3.14159265358979323846));
        System.out.println("Area = " + Math.pow( (4.5/2.0), 2) * 3.14159265358979323846);
    }
}
