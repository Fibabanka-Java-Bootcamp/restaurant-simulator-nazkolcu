package org.kodluyoruz;


import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Waiter waiter1 = new Waiter("waiter1", false);
        Waiter waiter2 = new Waiter("waiter2", false);
        Waiter waiter3 = new Waiter("waiter3", false);

        Chef chef1 = new Chef("chef1");
        Chef chef2 = new Chef("chef2");

        Customer customer1 = new Customer("customer1", "hamburger");
        Customer customer2 = new Customer("customer2", "pizza");
        Customer customer3 = new Customer("customer3", "kebap");
        Customer customer4 = new Customer("customer4", "döner");
        Customer customer5 = new Customer("customer5", "dondurma");
        Customer customer6 = new Customer("customer6", "şırdan");


        ExecutorService executorService = Executors.newFixedThreadPool(5);

        waiter1.start();
        chef1.start();
        chef2.start();
        waiter2.start();
        waiter3.start();

        executorService.submit(customer1);
        executorService.submit(customer2);
        executorService.submit(customer3);
        executorService.submit(customer4);
        executorService.submit(customer5);
        executorService.submit(customer6);

        waiter1.join();
        waiter2.join();
        waiter3.join();
        chef1.join();
        chef2.join();

        executorService.shutdown();
    }
}
