/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class Main_Bai7 {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Vios";

        car.accelerate(50);
        car.displayStatus();

        car.accelerate(60);
        car.displayStatus();

        System.out.println("OverSpeed? " + car.isOverSpeed());

        car.brake(30);
        car.displayStatus();
    }
}

