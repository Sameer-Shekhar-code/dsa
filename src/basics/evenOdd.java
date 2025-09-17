package basics;

import java.util.Scanner;

public class evenOdd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to check");
        int x = sc.nextInt();

        if((x&1)> x){
            System.out.println("even number");
        } else if ((x|1) == x) {
            System.out.println("odd number");
        }
    }

}
