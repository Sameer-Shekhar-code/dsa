package Recursion.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 2,3,4,5,32};
        System.out.println(Lsearch(arr, 32, 0));
    }

    static boolean Lsearch(int[] arr,int target, int index){
        if(index == arr.length){
            return false;
        }
        if(arr[index] != target){
            return Lsearch(arr, target, index+1);
        }
        return true;
    }
}
