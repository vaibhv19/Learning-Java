package com.javabasics.oops;

//Polymorphism
class calculator{ //method overloading by using different no. of parameter
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int c, int b){
        return a+b+c;
    }
}
class printer{ //method overloading by using different datatypes
    void print(String s){
        System.out.println("string "+s);
    }
    void print(int a){
        System.out.println("int "+a);
    }
    void print(double a){
        System.out.println("double "+a);
    }
}
public class main {
    public static void main(String[] args) {
        calculator calc= new calculator();
        System.out.println(calc.add(10,20));
        System.out.println(calc.add(10,20,30));

        printer printer= new printer();
        printer.print("namaste");
        printer.print(20);
        printer.print(30.44);
    }
}
