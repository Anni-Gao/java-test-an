package com.experiment03.e7173;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        SpottedDog s=new SpottedDog(scan.next(),scan.nextInt(),scan.next(),scan.next());
        UnspottedDog us=new UnspottedDog(scan.next(),scan.nextInt(),scan.next());
        s.show();
        us.show();

    }
}


