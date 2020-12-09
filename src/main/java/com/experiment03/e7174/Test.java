package com.experiment03.e7174;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Vehicle v=new Vehicle(scan.nextInt(),scan.nextDouble());
        v.show();
        Car c=new Car(scan.nextInt(),scan.nextDouble(),scan.nextInt());
        c.show();
        Truck t=new Truck(scan.nextInt(),scan.nextDouble(),scan.nextInt(),scan.nextDouble());
        t.show();

    }
}