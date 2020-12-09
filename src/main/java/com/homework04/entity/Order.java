package com.homework04.entity;

public class Order {
    private User user;
    private Product[] products;

    public Order( User user, Product[] products){
        this.user = user;
        this.products = products;
    }
    public User getUser() {
        return user;
    }
    public Product[] getProducts(){
        return products;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }

}
