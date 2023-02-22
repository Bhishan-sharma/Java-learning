import java.util.Scanner;

public class TheString {
    String str;
    int len,word_count,cons;
    TheString(){
        str = "";
        len = 0;word_count = 0;cons = 0;
    }
    TheString(String ds){
        str = ds;
    }
    void cuntFreq(){
        str = str.toUpperCase();
        str += ' ';
        len = str.length();
        cons = len;
        char c;
        for (int i = 0; i < len; i++) {
            c = str.charAt(i);
            if (c == ' '){
                word_count++;
                cons--;
            }else if (c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U'){
                cons--;
            }
        }
    }
    void display(){
        System.out.println("original string : " + str);
        System.out.println("words in the string : " + word_count);
        System.out.println("consonants in the string : " + cons);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TheString ob = new TheString(s);
        ob.cuntFreq();
        ob.display();
    }
}
