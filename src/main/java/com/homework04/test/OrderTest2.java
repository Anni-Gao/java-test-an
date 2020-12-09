package com.homework04.test;
import com.homework04.entity.Order;
import com.homework04.entity.Product;
import com.homework04.entity.User;

import java.math.BigDecimal;

public class OrderTest2 {
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
    private static BigDecimal balanceCalculation(Order order){
        BigDecimal surplus = new BigDecimal(Double.toString(order.getUser().getBalance()));
        for (Product p: order.getProducts()){
            BigDecimal num = new BigDecimal(Double.toString(p.getPrice()));
            surplus = surplus.subtract(num);
            System.out.println(surplus);
        }
        return surplus;
    }
}
