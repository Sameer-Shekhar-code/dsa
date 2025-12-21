package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr={7,8,9,11};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        sort(arr);
//        List<Integer> arr= new ArrayList<>();
//
//        for(int i=0; i<nums.length; i++){
//            if(nums[i] != (i+1)){
//                arr.add(nums[i]);
//            }
//        }
//        return arr;
    }
    static int[] sort(int[] arr){
        int i=0;
        while(i<arr.length){
         int correct = arr[i] - 1;
//            int correct = arr[i] ;
            if( arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swap(arr, i , correct);
            }
            else{
                i++;
            }
        }
        return arr;
    }
    static int[] swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr;
    }
}
