package com.experiment01.e7186;

import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        int a[] = {-2,1,4,5,8,12,17,23,45,56,90,100};
        int x;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        int i;
        for(i=0; i<12; i++){
            if(a[i]==x){
                break;
            }
        }
        if(x<12){
            System.out.println(x + "是数组中的第" + i +"个元素");
        }
        else{
            System.out.println(x + "不在数组中");
        }
    }
}