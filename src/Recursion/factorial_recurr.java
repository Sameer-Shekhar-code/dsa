package Recursion;

public class factorial_recurr {
    public static void main(String[] args) {
        System.out.println(recur(55));
    }

    static long recur(int n){
        if ( n<=1){
            return 1;
        }
        return n * recur(n-1);
    }
}
