package model;

public class User {

    private String name;

    public User(String name){
        this.name = name;
    }

//    public isAdmin(String name, String password){
//
//    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
