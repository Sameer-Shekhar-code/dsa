package Oops.LibraryManagement;

public class User {
    private String name;
    private int age;
    private int booksIssued;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(int booksIssued) {
        this.booksIssued = booksIssued;
    }

    public User(String name, int age, int booksIssued) {
        this.name = name;
        this.age = age;
        this.booksIssued = booksIssued;
    }
}
