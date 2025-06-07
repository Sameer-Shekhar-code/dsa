import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String a="nassjkc";
        char arr[]=a.toCharArray();

       String[] arr2={"hello","world"};
       concat(arr2);
    }
    static void concat(String[] arr){
        String b="";
        for(int i=arr.length-1;i>=0;i--){
            b = arr[i]+b;
        }
        System.out.println(b);
    }
}
