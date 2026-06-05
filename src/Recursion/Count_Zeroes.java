package Recursion;

public class Count_Zeroes {
    public static int count(int n, int cnt){
        if(n==0){
            return cnt;
        }
        int rem = n%10;
        if(rem == 0){
            cnt += 1;
        }
        return count(n/10, cnt);

    }
    public static void main(String[] args) {
        System.out.println(count(30202,0));
    }
}
