package basics;

public class Varags {

    public static int sum(int... x){
        int sum=0;
        for (int num : x){
            sum = sum + num;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(50,30,20));
    }
}
