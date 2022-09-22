/*
Week 3-4 HW 3
Complete the methods below for calculations related to
the quadratic formula
 */

//import java.io.PrintStream;
import java.util.Scanner;

public class Week3HW3 {
    /*
    TODO: create a method, calculateDiscriminant() that:
    - takes in three double values, the coefficients of a quadratic equation: a,b,c
    - returns the "discriminant" of the quadratic, the portion under the root of
the formula
    - the discriminant should be returned as a double value
    note: remember that Java does NOT use ^ to do exponents, you can just do b^2 as
b*b in Java
     */
    //create the method here
    public static double calculateDiscriminant(double a, double b, double c) {

        return ((b * b) - (4 * a * c));
    }

    /*
     TODO: create a method, printQuadraticSolutions() that:
     - takes in the coefficients of a quadratic equation, a,b,c, as three double
values
     - prints a message based on the discriminant:
         prints "2 real solutions" if the discriminant is positive
         prints "No real solutions" if the discriminant is negative
         prints "1 real (repeated) solution" if the discriminant is zero
     - in the case that there are 2 solutions, it also prints both values, rounded
to
     3 decimal places, using printf() with the smaller root first
     - in the case that there is 1 repeated solution, it also prints the value,
rounded to
     3 decimal places, using printf()
     Note: this method does not return a value, it should just print the message
(void method)
      */
    //create the method here
    public static void printQuadraticSolutions(double a, double b, double c) {
       //!!Why can I not just call local variable "discriminant" (double a, double b, etc... double discriminant)...
        double discriminant = ((b * b) - (4 * a * c));
        double root1, root2;
        //How do I get around calling these two variables right here
        if (discriminant > 0) {
            root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("2 real solutions: \nx = %.3f \nx = %.3f\n ", root2, root1);
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.printf("1 real (repeated) solution: \nx = %.3f\n", root1);
        } else if (discriminant < 0) {
            System.out.println("No real solutions");
        }

    }

    public static void main(String[] args) {
        //this main method is for testing purposes
        //allows the coefficients to be input by the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Quadratic Equation: ax^2+bx+c=0");
        System.out.println("Please enter the coefficients.");
        System.out.println("a=?");
        double a = sc.nextDouble();
        System.out.println("b=?");
        double b = sc.nextDouble();
        System.out.println("c=?");
        double c = sc.nextDouble();
        //test calculateDiscriminant() method
        //this won't work until you make the method above
        double discriminant = calculateDiscriminant(a, b, c);
        System.out.printf("discriminant = %.3f\n", discriminant); //print to 3
        //decimals
        //test printQuadraticSolutions() method
        //this won't work until you make the method above
        printQuadraticSolutions(a, b, c);
        //!!Why in parentheses is there a,b,c is that just identifying the method?
    }
}
