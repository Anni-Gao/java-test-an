package com.experiment06.test3;

import java.util.InputMismatchException;

public class TestTriangle {
        static void triangle(int a, int b,int c) throws IllegalArgumentException, InputMismatchException {
            if(a<0||b<0||c<0||a+b<=c||a+c<=b||b+c<=a) throw new IllegalArgumentException();
            System.out.printf("三角形的三边长为：%d,%d,%d\n",a,b,c);
        }
}
