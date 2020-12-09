package com.homework04.test;
import com.homework04.entity.*;

public class OrderTest {
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
    private static double balanceCalculation(Order order){
        double surplus = order.getUser().getBalance();
        for (Product p: order.getProducts()){
            surplus = surplus - p.getPrice();
        }
        surplus = (double) Math.round(surplus*100)/100;
        return surplus;
    }
}