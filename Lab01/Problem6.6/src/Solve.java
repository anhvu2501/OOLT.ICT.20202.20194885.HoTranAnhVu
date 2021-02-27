import java.util.Scanner;
public class Solve {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n, m: ");
        n = sc.nextInt();
        m = sc.nextInt();
        int [][] A = new int[n][m];
        int [][] B = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
                B[i][j] = sc.nextInt();
            }
        }
        int [][] C = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];
        }
        sc.close();
    }
}
