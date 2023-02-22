import java.util.Scanner;

public class TwinPrime {
    public static int prime(int k){
        for (int i = 2; i < k; i++) {
            if(k%i == 0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            int next = i+2;
            if(prime(i) == 1 && prime(next) == 1){
                System.out.println(i + "  "+ next);
            }
        }
    }
}
