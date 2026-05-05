package searching;

public class BS {

    public static int  BiSe(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid]>target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2,3,4,5,6,7};
        System.out.println(BiSe(arr, 4));
    }
}
