package Recursion.Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        printk(4,0);
    }

    static void printk(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            printk(r,c+1);
        }
        else {
            System.out.println();
            printk(r-1, 0);
        }





    }
}
