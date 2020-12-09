package com.experiment07.test3;

public class SellTicket extends Thread{
    private Ticket ticket;

    public SellTicket(Ticket ticket) {
        super();
        this.ticket = ticket;
    }
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            try {
                ticket.sellTickets();
            } catch (Exception e) {
                System.out.println("卖完了！");
                break;
            }

        }
    }

}