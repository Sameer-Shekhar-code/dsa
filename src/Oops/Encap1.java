package Oops;

class User{
    private String name;
    private String email;
    private String password;

    public void setPassword(String password){
        if(this.password != password){
            if(password.length() < 8){
                this.password = password;
            }
        }

    }
}

public class Encap1 {
    public static void main(String[] args) {

    }
}
