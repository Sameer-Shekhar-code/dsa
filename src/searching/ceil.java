package searching;

import java.util.Scanner;

public class ceil  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5, 10, 15, 20, 25, 30};

        System.out.println("Enter the target element");
        int target = sc.nextInt();

        System.out.println(ceil(arr,target));

    }
    public static int ceil(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
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
        return arr[start];
    }



}
