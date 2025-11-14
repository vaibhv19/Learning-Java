package com.javabasics.oops;
//Inheritance
class Animal {
    void eat(){
        System.out.println("eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("bark");
    }
}
public class zoo{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
    }
}

