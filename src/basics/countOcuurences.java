package basics;

public class countOcuurences {
    public static void main(String[] args) {
        int n = 1385757879;

        String num = Integer.toString(n);

        int arr[]= new int[10];

        for(int i=0; i<num.length() ; i++){
            char a = num.charAt(i);
            int digit = a - '0';
            arr[digit]++;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                System.out.println( i + "->" + arr[i]);
            }
        }
    }
}
