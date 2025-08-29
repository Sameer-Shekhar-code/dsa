package Recursion;

public class five_to_one {

    public static void main(String[] args) {
        fun(5);
        funRev(5);
    }

    static void fun(int n) {
        System.out.print(n + " ");

        if (n == 1) {
            return;
        }
        fun(n - 1);

        System.out.println("");
    }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);

        System.out.print(n + " ");

    }
}
