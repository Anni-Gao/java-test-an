package com.experiment03.e7174;

class Car extends Vehicle {
    int passengers;

    Car(int num, double weight, int passengers) {
        super(num, weight);
        this.passengers = passengers;
    }

    void show() {
        System.out.println("小轿车:");
        System.out.println("轮子数:" + num + "个");
        System.out.println("自身重量:" + weight + "吨");
        System.out.println("额定乘客数:" + passengers + "人");
    }

}