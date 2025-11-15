package com.javabasics.multithreading;
//creating new thread by extending thread class
public class NumberCounter extends Thread {
    @Override
    public void run() {
        int count=0;
        for(int i=0;i<=100000;i++)
        {
            if(i%10==7)
            {
                count++;
            }
        }
        System.out.println("count="+count);
    }
}
