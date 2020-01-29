package com.company;

public class Main {

    public static void main(String[] args) {
        First first = new First();
        Thread firstThread = new Thread(first);
        Second second = new Second();
        Thread secondThread = new Thread(second);
        Third third = new Third();
        Thread thirdThread = new Thread(third);
        firstThread.start();
        secondThread.start();
        thirdThread.start();
        System.out.println("\nFiles Created :)");
    }
}