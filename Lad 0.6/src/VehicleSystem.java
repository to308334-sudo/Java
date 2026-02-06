/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
abstract class VehicleSystem {
    String brand;

    public VehicleSystem(String brand) {
        this.brand = brand;
    }

    public abstract int getMaxSpeed();

    public void showInfo() {
        System.out.println(brand + " - Max: " + getMaxSpeed());
    }
}

class CarSys extends VehicleSystem {
    public CarSys(String brand) { super(brand); }
    public int getMaxSpeed() { return 180; }
}

class MotorbikeSys extends VehicleSystem {
    public MotorbikeSys(String brand) { super(brand); }
    public int getMaxSpeed() { return 120; }
}
