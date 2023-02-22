import java.util.Scanner;

public class SumOfRDAndLD {
    static void Diagonal(int[][] arr,int m){
        int l,n,rd = 0,ld = 0;
        for (l = 0; l < m; l++) {
            for (n = 0; n < m; n++) {
                if(l == n){
                    ld += arr[l][n];
                } else if (l+n == m-1) {
                    rd += arr[l][n];
                }
            }
        }
        System.out.println("The sum of the left diagonal elements = " + ld);
        System.out.println("The sum of the right diagonal elements = " + rd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Diagonal(arr,n);
    }
}
