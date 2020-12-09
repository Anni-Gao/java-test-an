package com.experiment02.e1044;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Student stu = new Student(scan.next(), scan.nextInt(),scan.nextInt());
        System.out.println("Name:"+stu.getName() + " Age:" + stu.getAge() + " No:" + stu.getNo());
    }
}
