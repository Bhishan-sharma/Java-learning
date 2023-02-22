import java.util.Scanner;

public class NumCombination {
    public static void display(int n){
        int i,j,k,sum;
        for(i =1;i <= n/2+1; i++){
            sum = 0;
            for (j = i; j <= n/2+1; j++) {
                sum += j;
                if (sum == n){
                    break;
                }
            }

            if (j <= n/2+1){
                for (k = i; k <= j; k++) {
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        display(n);
    }
}