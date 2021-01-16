package org.kodluyoruz;

public class Chef extends Thread{
    private String name;

    public Chef(String name) {
        this.name = name;
    }

    public void prepareMeal(Order order){
        order.setState(true);
        System.out.println( order.getName()+"is prepared.");
    }

    public void run(){


    }
}
