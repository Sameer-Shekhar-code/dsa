package Oops.LibraryManagement;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> book;
    private ArrayList<User> user;

    public Library(){
        book = new ArrayList<>();
        user = new ArrayList<>();
    }

    public void addBook(Book b){
        book.add(b);
    }
    public void addUser(User u){
        user.add(u);
    }

    public void issueBook(String bookname, String userName){

        for(Book b : book){
            if(b.getName().equals(bookname) && b.getQuantity()>0){
                for(User u : user){
                    if(u.getName().equals(userName)){
                        b.setQuantity(b.getQuantity()-1);
                        u.setBooksIssued(u.getBooksIssued()+1);

                        System.out.println("Book issued");
                        return;
                    }
                }
                System.out.println("User not found");
                return;
            }
        }
        System.out.println("Book not available");

    }

    public void returnBook(String bookName, String userName){
        for(Book b : book){
            if(b.getName().equals(bookName) ){
                for(User u : user){
                    if(u.getName().equals(userName)){
                        u.setBooksIssued(u.getBooksIssued()-1);
                        b.setQuantity(b.getQuantity()+1);

                        System.out.println("Book "+b.getName() +" returned by user" + u.getName());
                        return;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java", 5);
        Book b2 = new Book("DSA", 3);

        User u1 = new User("Sameer", 20, 0);

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addUser(u1);

        lib.issueBook("Java", "Sameer");
        lib.returnBook("Java", "Sameer");
    }

}
