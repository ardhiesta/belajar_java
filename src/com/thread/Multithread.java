package com.thread;

import java.text.SimpleDateFormat; 
import java.util.Date;

public class Multithread extends Thread {
    public void run() {
        // retrieve main thread name
        String threadName = Thread.currentThread().getName(); 
        System.out.println("Main thread name : " + threadName);
        // format date and time, display second 
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // print 10x from index 0 to 9 
        for (int i = 0; i < 10; i++) {
            try {
                // pause main thread
                // pause for 1000 ms 
                Thread.sleep(1000);
            } catch (InterruptedException e) { 
                e.printStackTrace();
            }
                
            // print
            // main thread prints 10x + time info 
            System.out.println(
                "thread " +threadName + ", doing print " + i + ", at " 
                + formatter.format(new Date()));
        }
    }

    public static void main(String[] args) {
        // create 2 Multithread class objects 
        Multithread mt1 = new Multithread(); 
        Multithread mt2 = new Multithread();

        // run 2 threads of program 
        mt1.start();
        mt2.start();
    }
}
