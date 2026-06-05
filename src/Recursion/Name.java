package Recursion;

public class Name {

    public static void name(String name, int count){


        if(count==0){
            return;
        }
        System.out.println(name);
        name(name, count-1);

    }
    public static void main(String[] args) {
        int count = 5;
        name("Sameer",count);
    }
}
