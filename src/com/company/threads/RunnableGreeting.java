package com.company.threads;

public class RunnableGreeting implements  Runnable {

    @Override
    public void run() {
        System.out.println("Hello World, from a class implementing Runnable");
    }
}
