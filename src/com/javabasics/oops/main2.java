package com.javabasics.oops;

//polymorphism
class animal{ //method overriding
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("cat meows");
    }
}
class lion extends animal{
    void sound(){
        System.out.println("lion roar");
    }
}
public class main2 {
    public static void main(String[] args) {
        animal animal1= new cat();
        animal animal2= new lion();

        animal1.sound();
        animal2.sound();
    }
}
