package com.experiment03.e7176;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        English e=new English(scan.next());
        Math m=new Math(scan.next());
        Teach t=e;
        t.teaching();
        t=m;
        t.teaching();

    }
}

