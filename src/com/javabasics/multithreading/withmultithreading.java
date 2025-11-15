package com.javabasics.multithreading;

public class withmultithreading {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
     NumberCounter thread1 =new NumberCounter();//when extends Thread class

     SumCalculator sumCalculator=new SumCalculator();// when implement runnable
     Thread thread2=new Thread(sumCalculator);

     thread1.start();
     thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("total time="+(System.currentTimeMillis()-start)+"ms");

    }
}
