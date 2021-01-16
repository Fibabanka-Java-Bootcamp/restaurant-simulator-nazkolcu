package org.kodluyoruz;

public class Order {
    private String name;

    private boolean state;

    public void setState(boolean state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }



    public Order(String name) {
        this.name = name;
        this.state = false;
    }
}
