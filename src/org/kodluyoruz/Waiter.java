package org.kodluyoruz;

public class Waiter extends Thread{
    private String name;
    private boolean flag;
    public Waiter(String name, boolean flag){
        super(name);
        this.flag=flag;
    }
    public void run()
    {

    }
}
