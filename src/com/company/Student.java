package com.company;

public class Student {
    private String name;
    private String emaill;
    private int age;

    public void setAge(int a) {
        if (a<0){
            System.out.println(age+   "ters san bolbosh kerek" );
        }else
            age= a;


    }

    void setName(String a){
        name=a;
    }void setEmaill(String a){
        emaill=a;}

    String getName()
    {

        return name;
    }
    String getEmaill(){
        return emaill;
    }
    int getAge(){
        return age;
    }

}
