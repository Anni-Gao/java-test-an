package com.experiment02.e7198;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //write code here
        Scanner scan = new Scanner(System.in);
        Dog d1 = new Dog();
        Dog d2 = new Dog(scan.next(), scan.next(), scan.nextInt());
        System.out.println("name=" + d1.getName() + ",color=" +d1.getColor()+",age="+d1.getAge());
        System.out.println("name=" + d2.getName() + ",color=" +d2.getColor()+",age="+d2.getAge());

    }

}