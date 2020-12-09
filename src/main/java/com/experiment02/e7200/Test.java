package com.experiment02.e7200;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        //write your code here
        Scanner scan = new Scanner(System.in);
        Check check = new Check();
        System.out.println("Larger value: " + check.Check(scan.nextInt(), scan.nextInt()));
        System.out.println("a*b*c = " + check.Check(scan.nextDouble(), scan.nextDouble(), scan.nextDouble()));
        System.out.println("Are equal: " + check.Check(scan.next(), scan.next()));

    }
}