package com.experiment02.e7199;

import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Write your own code
        Prime prime = new Prime();
        if(prime.Prime(n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
