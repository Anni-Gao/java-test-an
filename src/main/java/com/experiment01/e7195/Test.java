package com.experiment01.e7195;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int number, digit1, digit2, digit3, digit4, newnum;
        int tmp;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        //WRITE CODE HERE
        digit4 = number%10;
        digit4 = (digit4 + 9)%10;
        digit3 = number/10%10;
        digit3 = (digit3 + 9)%10;
        digit2 = number/10/10%10;
        digit2 = (digit2 + 9)%10;
        digit1 = number/10/10/10%10;
        digit1 = (digit1 + 9)%10;

        tmp = digit1;
        digit1 = digit3;
        digit3 = tmp;

        tmp = digit2;
        digit2 = digit4;
        digit4 = tmp;

        newnum = digit1*1000 + digit2*100 + digit3*10 + digit4;
        System.out.println("The encrypted number is " + newnum);

    }

}