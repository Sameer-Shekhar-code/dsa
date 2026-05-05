package searching;

import java.util.Arrays;

public class rotateArrayApp_2 {

    public static int[] rotateA(int[] arr, int d){
       int n = arr.length;

       d %= n;

       int cycles = gcd(n,d);

       for(int i =0; i<cycles; i++){
           int first = arr[i];

           int curr = i;
           int next;
           while(true){
               next = (curr - d +n) %n;
               if(next == i){
                   break;
               }
               arr[curr] = arr[next];
               curr = next;
           }
           arr[curr] = first;
       }
       return arr;
    }

    public static int gcd(int a , int b){
        while(b!=0){
            int temp  = b;
            b = a%b;
            a = temp;
        }
        return a;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int d =2;
        System.out.println(Arrays.toString(rotateA(arr,d)));
    }
}
