package com.experiment01.e7194;

import java.util.Scanner;
public class Test {
    public static void main(String[] args){

        //write your own codes
        int repeat,a,n,ans,tmp;
        Scanner scan = new Scanner(System.in);
        repeat = scan.nextInt();
        while(repeat>0){
            a = scan.nextInt();
            n = scan.nextInt();
            ans = 0;
            tmp = a;
            for(int i=0; i<n; i++){
                ans +=tmp;
                tmp = tmp*10 + a;
            }
            System.out.println(ans);
            repeat--;
        }
    }
}
