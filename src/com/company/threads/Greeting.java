package com.company.threads;

public class Greeting extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World, from a subclassed Thread.");
    }
}
