import java.util.Arrays;
import java.util.Scanner;
public class TransposeMatrice{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[][] TransArr = new int[n][n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = count;
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                TransArr[i][j] = arr[j][i];
            }
        }

        System.out.println("Original matrices: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of Matrices: ");
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                System.out.print(TransArr[i][j] + " ");
            }
            System.out.println();
        }
        int SumOfCorners = arr[0][0] + arr[0][n-1] + arr[n-1][0] + arr[n-1][n-1];
        System.out.println("Sum of Corners: " + SumOfCorners);
    }
}
