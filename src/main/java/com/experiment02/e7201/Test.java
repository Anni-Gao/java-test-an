package com.experiment02.e7201;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //write your code
        Scanner scan = new Scanner(System.in);
        Point A = new Point(scan.nextInt(), scan.nextInt());
        Point B = A;
        System.out.println(B.getX());
        Point.fun1(B);
        B = Point.fun2();
        System.out.println(B.getX());
    }

}