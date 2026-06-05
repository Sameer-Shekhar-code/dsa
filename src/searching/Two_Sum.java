package searching;

import Recursion.Arrays.Sorted;
import com.sun.jdi.connect.Connector;

import java.util.Arrays;

public class Two_Sum {

     static int BinarySearch(int[] arr, int left, int right, int target){

         while(left<=right){
             int mid = left + (right-left)/2;

             if(arr[mid] == target){
                 return mid;
             }

             if(arr[mid]>target){
                 right = mid-1;
             }
             else {
                 left = mid+1;
             }
         }
         return -1;
     }

    public static void main(String[] args) {
        int[] arr= {2,7,11,15};
        int target = 9;
        int[] num = new int[2];
        Arrays.sort(arr);

        for(int i=0 ; i<arr.length; i++){
            int compliment = target - arr[i];

            int a = BinarySearch(arr, i+1, arr.length-1,compliment);

            if(a != -1){
                num[0]=i;
                num[1]=a;
                System.out.println(Arrays.toString(num));

                break;
            }
        }
    }
}
