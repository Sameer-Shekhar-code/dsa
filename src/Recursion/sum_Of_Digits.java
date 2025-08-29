package Recursion;

public class sum_Of_Digits {
    public static void main(String[] args) {
        System.out.println(sum(1342));
        System.out.println(num(1342));
    }

    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);

    }
    static int num(int n){
        return (int)Math.log10(n)+1;
    }
}
