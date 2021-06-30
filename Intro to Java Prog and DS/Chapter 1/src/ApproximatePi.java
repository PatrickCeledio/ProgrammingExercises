/*
    Patrick Celedio Intro to Java Prog. and Data Struct. 12th Ed

    1.7 (Approximate Pi) Pi can be computed using the following formula:
    Pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + ( (-1)^(i+1) ) / (2i - 1) )
    To translate into Java: Pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + Math.pow(-1, i+1) / (2 * i-1)

    Write a program that displays the result of
    4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
    and
    4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13).
    Use 1.0 instead of 1 in your program.
 */
public class ApproximatePi {
    public static void main(String[] args){
        double pi_1 =  4.0 * ( 1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0) );
        double pi_2 =  4.0 * ( 1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0) + (1.0/13.0) );
        System.out.print("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = ");
        System.out.print(pi_1 + "\n");
        System.out.print("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = ");
        System.out.print(pi_2 + "\n");
    }
}
