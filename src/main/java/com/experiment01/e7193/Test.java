package com.experiment01.e7193;

import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        //write your own codes
        double f,c;
        Scanner scan = new Scanner(System.in);
        f = scan.nextDouble();
        c = 5*(f-50)/9+10;
        System.out.printf("The temprature is %.2f",c);
    }
}
