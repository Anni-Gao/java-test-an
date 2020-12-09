package com.experiment06.test1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InputMismatchException {
        Scanner scan=new Scanner(System.in);
        try{
            int n = scan.nextInt();
            System.out.println(10-n);
        }catch(InputMismatchException e){
            System.out.println("not int");
        }
        finally {
            System.out.println("end");
        }

    }
}