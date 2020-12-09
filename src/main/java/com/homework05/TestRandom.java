package com.homework05;

import java.util.Random;

public class TestRandom {

    public static void main(String[] args){
        printRandoms(2,8,6);
    }
    private static int printRandoms(int x, int y, int times) {
        if(y <= x || times < 0){
            return -1;
        }
        for (int i = 0; i < times; i++){
            Random r = new Random();
            System.out.println(r.nextInt(y-x)+x);
        }
        return 1;
    }
}
