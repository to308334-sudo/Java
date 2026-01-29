/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class Car {
    String brand , model;
    int speed;

    public void accelerate(int value) {
        speed += value;
    }

    public void brake(int value) {
        speed -= value;
        if (speed < 0) speed = 0;
    }

    public void displayStatus() {
        System.out.println("mode: " + model + " – Speed: " + speed);
    }

    public boolean isOverSpeed() {
        return speed > 100;
    }
}

