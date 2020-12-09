package com.experiment01.e7197;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m, n;

        m = scanner.nextInt();
        n = scanner.nextInt();

        //write your code
        int count = 0;
        for(int i=m;i<=n;i++){
            if(i%100==0){
                if(i%400==0){
                    System.out.print(i+ " ");
                    count++;
                    if(count%4==0){
                        System.out.println();
                    }
                }
            }
            else if(i%4==0){
                System.out.print(i + " ");
                count++;
                if(count%4==0){
                    System.out.println();
                }
            }
        }

    }
}