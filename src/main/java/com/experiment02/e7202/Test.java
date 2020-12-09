package com.experiment02.e7202;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int m,n;    //第一个数的实部和虚部
        int p,q;    //第二个数的实部和虚部
        Scanner scanner =new Scanner(System.in);
        m=Integer.parseInt(scanner.next());
        n=Integer.parseInt(scanner.next());
        p=Integer.parseInt(scanner.next());
        q=Integer.parseInt(scanner.next());
        Complex t =new Complex(m,n);
        Complex s =new Complex(t);
        Complex r=new Complex(p,q);
        (s.Add(r)).Print();
        (t.Sub(r)).Print();
    }
}