//2.2.5
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
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
    }
}
