package twoDmatrix;

import java.util.Arrays;

public class Rotate90 {

    public static void transpose(int[][] arr){
        int n = arr.length;
        for(int i=0; i<n -1; i++){
            for(int j=i+1; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        reverse(arr);
    }
    public static void reverse(int[][] arr){

        int i=0;
        while(i<arr.length){
            int t=0;
            int j= arr.length-1;
            while(t< j){
                int temp = arr[i][t];
                arr[i][t] = arr[i][j];
                arr[i][j] = temp;
                t++;
                j--;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}};
        transpose(arr);

    }
}
