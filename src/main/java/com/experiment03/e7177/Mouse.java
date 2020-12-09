package com.experiment03.e7177;

class Mouse extends Animal{
    String name;
    Mouse(String name){
        this.name=name;
    }
    void speak() {
        System.out.println(name+"的叫声为吱吱");
    }
}
