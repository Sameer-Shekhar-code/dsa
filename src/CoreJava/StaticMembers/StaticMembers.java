package CoreJava.StaticMembers;

public class StaticMembers {
    static int x =10;
    int y = 20;

    public static void main(String[] args) {
        StaticMembers s1 = new StaticMembers();
        System.out.println(s1.x + " "+ s1.y);
        StaticMembers.x = 60;
        s1.y = 30;
        System.out.println(s1.x + " "+ s1.y);
        StaticMembers s2 = new StaticMembers();
        System.out.println(s2.x + " "+ s2.y);



    }
}
