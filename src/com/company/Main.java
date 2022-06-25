package com.company;

public class Main {

    public static void main(String[] args) {




        Doc doc =new Doc();
        doc.setName("baltek");
        doc.setAge(5);
        doc.setBreed("Alabai");
        System.out.println("name doc:  " +doc.getName()+ "  age doc: "+doc.getAge()+" breed doc: "+doc.getBreed());

        Cat cat = new Cat();
        cat.setName("Mui");
        cat.setAge(3);
        cat.setBreed("tigr");
        System.out.println("name cat: "+cat.getName()+" age cat: "+cat.getAge()+"  breed cat: "+cat.getBreed());

        Popugai popugai=new Popugai();
        popugai.setName("Popi");
        popugai.setAge(3);
        popugai.setBreed("fila");
        System.out.println("name popugai: "+popugai.getName()+"  age popugai: "+popugai.getAge()+" breed popugai: "+popugai.getBreed());

        Fish fish = new Fish();
        fish.setName("asman");
        fish.setAge(2);
        fish.setBreed("farel");
        System.out.println("name fish: "+fish.getName()+" age fish: "+fish.getAge()+"  breed popugai; "+fish.getBreed());




    }
}
