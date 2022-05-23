package com.example.userapp;

public class User2_Character {
    private  String nationality;
    private String age;
    private String name;

    public User2_Character(String nationality, String age, String name){
        this.nationality = nationality;
        this.age = age ;
        this.name = name;
    }
    //    nationality
    public String get_nationality(){
        return nationality;
    }
    public void set_nationality(String nationality){
        this.nationality = nationality;
    }
    //    age
    public String get_age(){
        return age;
    }
    public void set_age(String age){
        this.age = age;
    }
    //    name
    public String get_name(){
        return name;
    }
    public void set_name(String name){
        this.age = age;
    }

}