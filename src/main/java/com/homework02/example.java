package com.homework02;

import java.util.Scanner;

public class example {

    public static void main(String[] args) {

        testString();

    }

    private static void testString() {

        Scanner sc = new Scanner(System.in);

        String[] array = new String[10];

        for(int i = 0; i < 10; i++)

            array[i]= sc.nextLine();

        for (String n : array){

            int length = n.length();

            if(length >= 2 && length <= 4)

                System.out.println(n);

        }

    }

}

