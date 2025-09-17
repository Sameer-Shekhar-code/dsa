package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Knacksack {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter max weight");
        int maxWeight=sc.nextInt();
        System.out.println("Enter the number of items");
        int n = sc.nextInt();
        List<Integer> profit = new ArrayList<>();
        List<Integer> weight = new ArrayList<>();

        int i=0;
        System.out.println("Enter the profit values of each item");
        while(i<n){
            System.out.println("item " + (i+1));
            int x = sc.nextInt();
            profit.add(x);
            i++;
        }
        System.out.println("Enter the weights of each item");
        while(i<n){
            System.out.println("item " + (i+1));
            int x = sc.nextInt();
            weight.add(x);
            i++;
        }

        double arr[] = new double[n];
        for(int j=0; j<n; j++){
            arr[j] = profit.get(j) / weight.get(j);
        }
        

    }

}
