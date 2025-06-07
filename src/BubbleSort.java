import java.lang.reflect.Array;
import java.util.Arrays;



public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={12,23,42,12,2,-1};
        System.out.println(Arrays.toString(selecion(arr)));
    }
    static int[] selecion(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last= arr.length-1-i;
            int max=getMax(arr, last);
            swap(arr, last, max);
        }
        return arr;
    }
    static int getMax(int[] arr,int last){
        int max= 0;
        for(int i=1; i<=last; i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static int[] swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        return arr;
    }

    static int[] bubble(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
