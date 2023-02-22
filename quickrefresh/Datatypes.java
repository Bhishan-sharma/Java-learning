public class Datatypes {
    public static void main(String[] args) {
        //primitive datatypes
        byte lower  = -128;
        byte upper = 127;
        short low = /*-32768 ||*/ (short)(-1*((Math.pow(2,16))/2));
        short up = /*32767 ||*/(short)((Math.pow(2,16)/2)-1);
        int a = /*-2147483648*/(int)(-1*((Math.pow(2,32))/2));
        int b = /*2147483647*/(int)((Math.pow(2,32)/2)-1);
        long f = (long)(-1*((Math.pow(2,64))/2));
        long g = (long)((Math.pow(2,64)/2)-1);
        double l = 1000000000.0;
        System.out.println(a);
    }
}
