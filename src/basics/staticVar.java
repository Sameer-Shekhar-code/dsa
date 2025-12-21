package basics;

public class staticVar {
    int age;
    int salary;
    String name;
    Boolean married;
    static int population = 1000;

    public staticVar(int age, int salary, String name, Boolean married){
        this.age=age;
        this.salary=salary;
        this.name=name;
        this.married=married;
        staticVar.population += 1;
    }

    public static void main(String[] args) {
        staticVar s1=new staticVar(34, 2000, "k" , false);
        System.out.println(staticVar.population);
        staticVar s2=new staticVar(30, 4000, "s" , false);
        System.out.println(staticVar.population);
    }
}
