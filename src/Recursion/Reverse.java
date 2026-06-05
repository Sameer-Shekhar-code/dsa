package Recursion;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }

    public static int reverse(int n){
        if(n == 0){
            return 0;
        }

        int dig = (int)Math.log10(n);

        return ((n%10)*((int)Math.pow(10,dig)))+reverse(n/10);
    }
}
