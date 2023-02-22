import java.util.Scanner;


public class CircularMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr= new int[n][n];
        int row = 0;
        int col = 0;
        int i = 0;
        while(i <= n*n){
            row = 0;
            col = i;
            arr[row][col] = i;
            if(n%i == 0){
                arr[row][col] = i;
            }
            i++;
        }
    }
}