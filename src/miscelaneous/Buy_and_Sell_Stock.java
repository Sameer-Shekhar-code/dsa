package miscelaneous;

import java.util.Arrays;

public class Buy_and_Sell_Stock {
    public static int profit(int[] arr){
        int min= arr[0];
        int max = arr[0];
        int res = 0;
        int i=0;

        while(i<arr.length){
            //minima condition
            while(arr[i]>=arr[i+1] && i>arr.length-1){
                i+=1;
            }
            min = arr[i];
            //maxima condition
             while(arr[i] <= arr[i+1] && i> arr.length-1) {
                i+=1;
            }
            max = arr[i];

             res = max - min;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr= {100, 180, 260, 310, 40, 535, 695};

    }
}
