package com.experiment07.test2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String array[] = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈"};
        Person person = new Person();

        Set<Integer> set = new LinkedHashSet<Integer>();
        while (true) {
            if (set.size() == 10) {
                break;
            }
            //乱序排列（随机）
            int a = (int) (Math.random() * 10);
            set.add(a);
        }
        for (int b : set) {
            Thread th = new Thread(person, array[b]);
            th.start();
        }
    }
}
