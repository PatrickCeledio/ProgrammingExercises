/*
    Patrick Celedio Intro to Java Prog. and Data Struct. 12th Ed

    1.6 (Summation of a series) Write a program that display the result of
    1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
 */
public class SummationOfASeries {
    public static void main(String[] args) {
        int sum = 0;
        int n = 9;
        for (int i=1; i<= n; i++){
            sum += i;
        }
        System.out.println("The result of " +
                " 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 is " + sum + "!");
    }
}
