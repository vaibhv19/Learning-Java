package com.javabasics.oops;
//class
//Encapsulation
public class car {
    private String color;
    private  int speed;

    public car(String color){
        this.color= color;
    }
  public void  setSpeed(int speed) {
        if(speed<0){
            System.out.println("not possible");
        }
        else {
            this.speed = speed;
            System.out.println("driving at  speed "+speed);
        }
    }
}
