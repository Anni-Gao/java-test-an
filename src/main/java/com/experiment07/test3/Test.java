package com.experiment07.test3;

public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(200);
        SellTicket t1 = new SellTicket(ticket);
        t1.setName("哈站");
        SellTicket t2 = new SellTicket(ticket);
        t2.setName("哈东站");
        SellTicket t3 = new SellTicket(ticket);
        t3.setName("哈西站");

        t1.start();
        t2.start();
        t3.start();

    }
}
