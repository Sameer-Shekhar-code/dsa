package searching;

import java.util.Arrays;

public class rotateArray {
    public static int[] rotate(int arr[], int d){

        int n = d%arr.length;
        while(d!=0) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {

                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            d--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,2,4};
        int d = 9;
        System.out.println(Arrays.toString(rotate(arr,d)));
    }
}
