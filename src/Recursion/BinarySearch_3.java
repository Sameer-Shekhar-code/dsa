package Recursion;

public class BinarySearch_3 {
    public static void main(String[] args) {
        int[] arr={9,16,23,25,32,56,77,78,80,81};

        System.out.println(BinarySearch(arr,23,0,9));
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid= start + (end-start)/2;

        if(arr[mid]==target){
            return mid+1;
        }
        if(arr[mid]>target){
            return BinarySearch(arr,target,start,mid-1);
        }
        return BinarySearch(arr,target,mid+1,end);
    }
}
