package com.javabasics.collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CF {
    public static void main(String[] args) {
        //List used when allowing duplicate in order
        //Arraylist

        List<Integer> arraylist= new  ArrayList<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        System.out.println(arraylist);
        List<Integer> list = List.of(1,2,3,4,5);//another method

        //linkedlist
        List<Integer> linkedlist= new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        System.out.println(linkedlist);

        //contains same methods but internal working in different in both
    }
}
