package com.experiment07.test1;

public class Test {
    public static void main(String[] args) {
        Animal rabbit = new Animal();
        Animal turtle = new Animal();
        rabbit.setName("兔子");
        turtle.setName("乌龟");
        turtle.start();
        rabbit.start();
    }
}
