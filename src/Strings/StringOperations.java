package Strings;

public class StringOperations {
    public static void main(String[] args) {

        System.out.println('a' + 'b');
        String var= "a" + 1;
        System.out.println(var);

        int x = 30;
        String str = Integer.toString(x);
        char[] arr = str.toCharArray();
        int j = arr.length-1;
        for(int i=0 ; i<arr.length; i++){
            if(arr[i] == arr[j]){
                j--;
            }

        }


    }
}
