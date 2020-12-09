package com.experiment01.e7196;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        //write your code
        double x,ans;
        x = 1;
        ans = 0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                ans += 1.0/x;
            }
            else{
                ans -= 1.0/x;
            }
            x += 3;
        }
        System.out.println(ans);

    }
}
