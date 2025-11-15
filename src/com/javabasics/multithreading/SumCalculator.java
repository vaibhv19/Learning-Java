package com.javabasics.multithreading;
// creatng new thread by implementing runnable
public class SumCalculator implements Runnable{
    @Override
    public void run() {
        long sum=0;
        for(int i=0;i<=100000;i++)
        {sum=sum+i;}
        System.out.println("sum="+sum);
    }
}
