package com.experiment02.e7203;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            ObjectCounter str1 = new ObjectCounter();
        }
        System.out.println(ObjectCounter.getCount());
    }
}