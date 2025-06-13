package mathematics;

public class SquareRoot {
    public static void main(String[] args) {

        int n = 36;

        int start= 0 ;
        int end = n;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid * mid >n){
                end = end - 1;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println(end);
    }
}
