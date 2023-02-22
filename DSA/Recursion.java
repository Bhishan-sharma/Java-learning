package DSA;
public class Recursion {
    static long  factorial(long input){
        if(input == 0) return(1);
        else return(input * factorial(input-1));
    }
    public static void main(String[] input) {
        System.out.println("factorial of 3 is "+factorial(3));
        printing(10);
    }
    static void printing(int n){
        if (n == 0) return;
        System.out.println(n-1);
        printing(n-1);
    }
}