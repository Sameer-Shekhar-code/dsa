package searching;

public class searchInSortedArrayOfInfiniteNumbers {
    public static void main(String[] args) {


    }

    public static int ans(int[] arr, int target){
        int start= 0;
        int end = 1;
        int res = BinarySearch(arr, target, start,end);
        if (res == -1) {
            start = end;
            end = 2*end;
            ans(arr, target);
        }
        return res;
    }


    public static int BinarySearch(int arr[], int target, int start, int end) {
        while(start<=end){
            int mid= start + (end-start)/2;

            if(target<arr[mid]){
                end= mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }
}
