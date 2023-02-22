import java.util.Scanner;

public class Main {
    int num,revnum;
    Scanner sc = new Scanner(System.in);

    public void Combinations(int n){
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
    Main(String check){
        if (check.equals("Palindrome")) {
            this.num = 0;
            this.revnum = 0;
            this.accept();
            this.check();
        }else if (check.equals("Combinations")){
            System.out.println("Combinations");
        }
    }
    void accept(){
        System.out.print("Input number : ");
        num = sc.nextInt();
        System.out.println();
    }
    int reverse(int y){
        if(y == 0){
            return revnum;
        }
        revnum = revnum*10 + y%10;
        return reverse(y/10);
    }
    void check(){
        if (num == reverse(num)){
            System.out.println(num + " number is a palindrome");
        }else System.out.println(num + " number is not a palindrome");
    }
    void Diagonal(int[][] arr,int m){
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
}
