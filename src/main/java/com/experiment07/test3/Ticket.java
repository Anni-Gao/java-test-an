package com.experiment07.test3;

public class Ticket {
    private int tickets;

    public Ticket(int tickets) {
        super();
        this.tickets = tickets;
    }
    synchronized public void sellTickets() throws Exception {
        if(tickets > 0) {
            tickets-- ;
            System.out.println(Thread.currentThread().getName()+"卖了1张票,剩余票数："+tickets);
        }else {
            throw new Exception("票已全部售完");
        }
    }
}
