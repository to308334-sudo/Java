/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class TestCar {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Vios", 60);
        c.accelerate(50);
        c.brake(10);
        c.displayStatus();

        if (c.isOverSpeed())
            System.out.println("Xe dang vuot qua toc do cho phep");
    }
}

