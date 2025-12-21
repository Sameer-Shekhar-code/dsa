package mathematics;

import java.util.*;

public class HappyNumber {
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>();
        int n= 19;

        while(true){
        int squares = sum(n);
        if(squares == 1){
            System.out.println("true");
            break;
        }
        if(check(arr,squares)){
            System.out.println("false");
            break;
        }
        n = squares;
        }


    }

    static int sum(int n){
        int s=0;
        while(n>0){
            int a = n%10;
            n = n/10;
            s += a*a;
        }
        return s;
    }
    static boolean check(List<Integer> arrayList , int n){
        if(arrayList.contains(n)){
            return true;
        }
        arrayList.add(n);
        return false;
    }
}
