public class Digits {
    public static void main(String[] args) {
        int[] arr={5,10,234,5324,324,43245,2325};
        for(int i=0 ; i<arr.length; i++){
            System.out.println((int)(Math.log10(arr[i]))+1);
        }
    }
}
