/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class VehicleB5 {
    String brand;

    void start() {
        System.out.println("Xe dang khoi dong");
    }
}

class CarB5 extends VehicleB5 {
    int seatCount;
}

class ElectricCarB5 extends CarB5 {
    int batteryCapacity;
}


