package com.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SingleThread {
    public static void main(String[] args) {
        // get the name of thread
        String threadName = Thread.currentThread().getName(); 
        System.out.println("Thread's name : " + threadName); 
        // format date and time, include second
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
        // print 10 times, from 0 to 9 
        for (int i = 0; i < 10; i++) { 
            try { 
              // pause main thread 
              // delayed 1000 ms  
              Thread.sleep(1000); 
            } catch (InterruptedException e) { 
              e.printStackTrace(); 
            } 

            // print 
            // main thread execute print 10 time and display the time 
            System.out.println("thread " + threadName + ", doing print " + i + ", at " + formatter.format(new Date())); 
        } 
    }
}
