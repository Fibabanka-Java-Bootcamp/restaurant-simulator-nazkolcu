package org.kodluyoruz;

public class Customer implements Runnable{
    private String name;
    private String orderName;
    private Order order;

    public Customer(String name, String order) {
        this.name = name;
        this.order= new Order(order);
    }
    @Override
    public void run() {
        System.out.println("müşteri: " + name + " is ready for order!");
        notify();
        try {
            System.out.println(name + "'s order is " + order);
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("müşteri: " + name + " is leaving the table!");
    }
}

