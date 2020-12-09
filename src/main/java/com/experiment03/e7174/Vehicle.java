package com.experiment03.e7174;

class Vehicle{
    int num;
    double weight;
    Vehicle(int num,double weight){
        this.num=num;
        this.weight=weight;
    }
    void show() {
        System.out.println("汽车:");
        System.out.println("轮子数:"+num+"个");
        System.out.println("自身重量:"+weight+"吨");
    }
}
