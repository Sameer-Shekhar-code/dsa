package Recursion;

public class Name {
    public static void main(String[] args) {
        f(0);
    }

    static void f(int count){

        if(count == 5){
            return;
        }
        String name= " Sameer ";
        System.out.println(name);
        count++;
        f(count);

    }
}
