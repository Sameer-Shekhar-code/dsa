package Recursion;

public class OnetoN {
    public static void main(String[] args) {
        int count = 1;
        f(5, count);
    }
    static void f(int n, int count){
        if(count >n){
            return;
        }

        f(n, count+1);
        System.out.println(count);
    }
}
