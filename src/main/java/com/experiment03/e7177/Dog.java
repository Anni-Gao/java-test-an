package com.experiment03.e7177;

class Dog extends Animal{
    String name;
    Dog(String name){
        this.name=name;
    }
    void speak() {
        System.out.println(name+"的叫声为喵喵");
    }
}
