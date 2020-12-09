package com.experiment03.e7174;

class Truck extends Vehicle{
    int passengers;
    double products;
    Truck(int num,double weight,int passengers,double products){
        super(num,weight);
        this.passengers=passengers;
        this.products=products;
    }
    void show() {
        System.out.println("卡车:");
        System.out.println("轮子数:"+num+"个");
        System.out.println("自身重量:"+weight+"吨");
        System.out.println("额定乘客数"+passengers+"人");
        System.out.println("载重量"+products+"吨");
    }
}
