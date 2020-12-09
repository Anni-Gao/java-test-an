package com.homework04.test;
import com.homework04.entity.*;

import java.math.BigDecimal;

public class OrderTest1 {
    public static void main(String[] args){
        User user = new User("myself",99);
        Product p1 = new Product("方便面",5.5);
        Product p2 = new Product("火腿肠",2.2);
        Product[] pp = {p1,p1,p2,p2,p2,p2,p2,p2};
        Order order = new Order(user,pp);
        order.setUser(user);
        order.setProducts(pp);
        System.out.println(balanceCalculation(order));
    }
    public static BigDecimal doubleToBig(double d1){
        return new BigDecimal(String.valueOf(d1));
    }
    private static BigDecimal balanceCalculation(Order order){
        BigDecimal surplus = doubleToBig(order.getUser().getBalance());
        for (Product p: order.getProducts()){
            BigDecimal num = doubleToBig(p.getPrice());
            surplus = surplus.subtract(num);
            System.out.println(surplus);
        }
        return surplus;
    }
}