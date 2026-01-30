/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class Car {
    String brand, model;
    int speed;

    Car(String b, String m, int s) {
        brand = b;
        model = m;
        speed = s;
    }

    void accelerate(int value) {
        speed += value;
    }

    void brake(int value) {
        speed -= value;
        if (speed < 0) speed = 0;
    }

    void displayStatus() {
        System.out.println("Model: " + model + " – Speed: " + speed);
    }

    boolean isOverSpeed() {
        return speed > 100;
    }
}

