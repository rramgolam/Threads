package com.company.threads;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from Main");

        Thread greeting = new Greeting();
        greeting.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("Hello World, from an anonymous class");
            }
        }.start();

        Thread anotherGreeting = new Thread(new RunnableGreeting());
        anotherGreeting.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World, from an anonymous runnable thread");
            }
        }).start();

        new Thread(() -> System.out.println("Hello World, from an anonymous runnable lambda thread")).start();

    }
}
