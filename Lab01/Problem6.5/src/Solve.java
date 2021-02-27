import java.util.Scanner;
public class Solve {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter array's elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        int avr = sum / n;
        System.out.println("Sum of all elements in the array: " + sum);
        System.out.println("Average value: " + avr);
        sc.close();
    }
}
