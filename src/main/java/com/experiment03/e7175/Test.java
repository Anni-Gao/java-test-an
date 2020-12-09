package com.experiment03.e7175;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        BasicEmployee bas=new BasicEmployee(scan.next(),scan.next(),scan.nextDouble());
        bas.showSalary();
        bas.showBonus();
        GoodEmployee god=new GoodEmployee(scan.next(),scan.next(),scan.nextDouble(),scan.nextDouble());
        god.showSalary();
        god.showBonus();
    }
}

