package searching;

import java.util.ArrayList;
import java.util.List;

public class Ceil {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        System.out.println(BinarySearch(arr, 15));
    }
    static int BinarySearch(int[] arr,int target){

        List<Integer> ar=new ArrayList<>();
        ar.get(2);


        int start=0;
        int end= arr.length-1;

        while(start<=end){

            int mid= start+(end-start)/2;

            if (target == arr[mid]) {
                return mid;
            }

            if(target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]){
                start =mid+1;
            }
        }
        return arr[start];
    }

}
