package com.experiment02.e7198;

class Dog{

    private String name,color;
    private int age;

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
    public Dog(){
        name = "dog1";
        color = "white";
        age = 1;
    }
    public Dog(String name, String color, int age){
        this.name = name;
        this.color =color;
        this.age = age;
    }
}
