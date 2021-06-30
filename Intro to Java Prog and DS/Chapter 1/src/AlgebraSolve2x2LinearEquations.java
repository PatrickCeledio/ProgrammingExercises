/*
    Patrick Celedio Intro to Java Prog. and Data Struct. 12th Ed

    1.13 (Algebra: Sovle 2x2 Linear Equations) Cramer's Rule is allowed.
    Write a program that solves the following equation and displays the value for x and y:
    3.4x + 50.2y = 44.5
    2.1x + .55y = 5.9
 */
public class AlgebraSolve2x2LinearEquations {
    public static void main(String[] args){
        System.out.println("Given the following linear equations:\n" +
                " 3.4x + 50.2y = 44.5\n" +
                " 2.1x + .55y = 5.9\n" +
                "The solution for the following equation is:\n " +
                "Let: a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9\n" +
                "By Cramer's Rule, x = (ed-bf)/(ad-bc) and y = (af-ec)/(ad-bc)\n" +
                "x = " + ((44.5*0.55)-(50.2*5.9))/((3.4*0.55)-(50.2*2.1)) +
                " and y = " + ((3.4*5.9)-(44.5*2.1))/((3.4*0.55)-(50.2*2.1)));
    }
}
