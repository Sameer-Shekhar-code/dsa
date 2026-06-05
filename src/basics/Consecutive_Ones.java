package basics;

public class Consecutive_Ones {


    public static void main(String[] args) {
        int[] arr ={0,1,1,0,1,1,1,0};
        int count = 0;
        int[] arr2 = new int[arr.length];

        int j=0;
        for(int i=0; i<arr.length; i++){

            if(arr[i] == 0){
                arr2[j] = count;
                count = 0;
            }
        }
    }
}
