package com.experiment03.e7177;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Animal d=new Dog(scan.next());
        Animal m=new Mouse(scan.next());
        d.speak();
        m.speak();
    }
}

