package com.javabasics.collectionframework;

import java.util.HashSet;
import java.util.Set;

public class CF2 {
    public static void main(String[] args) {
        //set used to store unique elements
        //HashSet
        //hash --> same input --> same output -->index
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(3);
        set.add(3);
        set.add(4);
        System.out.println(set);

        // LinkedHashset works the same but does maintain order to the elements
    }
}
