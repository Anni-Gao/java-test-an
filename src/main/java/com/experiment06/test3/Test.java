package com.experiment06.test3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        try{
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            TestTriangle.triangle(a,b,c);
        }
        catch(InputMismatchException e) {
            System.out.println("请输入整数作为三角形的边长！");
        }
        catch(IllegalArgumentException e) {
            System.out.println("a,b,c不能构成三角形");
        }
    }
}
