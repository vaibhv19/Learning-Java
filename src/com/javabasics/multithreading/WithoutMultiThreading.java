package com.javabasics.multithreading;

public class WithoutMultiThreading {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long sum=0;
        for(int i=0;i<=100000;i++)
        {sum=sum+i;}
        System.out.println("sum="+sum);
    int count=0;
    for(int i=0;i<=100000;i++)
    {
        if(i%10==7)
        {
       
        }
    }
        System.out.println("count="+count);
        System.out.println("total time=" + (System.currentTimeMillis()-start)+"ms");
    }
}
