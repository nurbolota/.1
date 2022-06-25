package com.company;

public class Doc {
   private String name;
    private int age;
    private String breed;

    public void setAge(int a) {
         age=a;

    }

    public void setName(String a) {
        name=a;

    }

    public void setBreed(String a) {
        breed=a;
    }String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }String getBreed(){
        return breed;
    }
}
