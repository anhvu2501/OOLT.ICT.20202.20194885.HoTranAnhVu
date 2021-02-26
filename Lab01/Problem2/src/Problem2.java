//2.2.5 and 2.2.6
import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Problem2 {
    public static void solveLinear (double a, double b) {
        if (a == 0 && b == 0)
            System.out.println("Infinite solutions");
        if (a == 0 && b != 0)
            System.out.println("No solution");
        if (a != 0)
            System.out.println("One solution: " + -b/a);
    }
    public static void solveLinear2 (double a_11, double a_12, double b_1, double a_21, double a_22, double b_2) {
        double D, Dx, Dy;
        D = abs(a_11 * a_22 - a_12 * a_21);
        Dx = abs(b_1 * a_22 - b_2 * a_12);
        Dy = abs(a_11 * b_2 - a_21 * b_1);
        System.out.println("Solution: ");
        System.out.println("x = " + Dx/D);
        System.out.println("y = " + Dy/D);
    }

    public static void solveQuad (double a, double b, double c) {
        if (a == 0 && b == 0)
            solveLinear(b, c);
        if (a != 0) {
            double d = b*b - 4*a*c;
            if (d < 0)
                System.out.println("No solution");
            if (d == 0)
                System.out.println("Only one solution: " + -b/(2*a));
            if (d > 0)
                System.out.println("Two separate solutions: " + (-b + sqrt(d))/(2*a) + "and " + (-b - sqrt(d))/(2*a));
        }
    }

    public static void main(String[] args) {
        //2.2.5
        double num1, num2, sum, diff, mul, div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        num2 = sc.nextDouble();
        sum = num1 + num2;
        diff = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        System.out.println("Sum :" + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        //2.2.6 - Linear equation
        double a, b;
        System.out.println("Enter a:");
        a = sc.nextDouble();
        System.out.println("Enter b");
        b = sc.nextDouble();
        solveLinear(a, b);
        //2.2.6 - Linear System
        double a_11, a_12, b_1, a_21, a_22, b_2;
        System.out.println("2.2.6b - Enter Parameters: ");
        a_11 = sc.nextDouble();
        a_12 = sc.nextDouble();
        b_1 = sc.nextDouble();
        a_21 = sc.nextDouble();
        a_22 = sc.nextDouble();
        b_2 = sc.nextDouble();
        solveLinear2(a_11, a_12, b_1, a_21, a_22, b_2);
        //2.2.6 - Quadratic equation
        double x, y, z;
        System.out.println("2.2.6c - Enter Parameters: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        solveQuad(x, y, z);
        sc.close();
    }
}
