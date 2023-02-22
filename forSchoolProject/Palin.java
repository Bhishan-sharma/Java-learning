import java.util.Scanner;

public class Palin {
    int num;
    int revnum;
    Scanner sc = new Scanner(System.in);
    Palin(){
        num = 0;
        revnum = 0;
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

    public static void main(String[] args) {
        Palin ob = new Palin();
        ob.accept();
        ob.check();
    }
}