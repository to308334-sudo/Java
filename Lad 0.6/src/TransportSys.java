/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
abstract class TransportSys {
    String name;

    public TransportSys(String name) {
        this.name = name;
    }

    public abstract double calculateCost(double d);
    public abstract int getCapacity();

    public void showInfo(double d) {
        System.out.println(name +
                " - Cost: " + calculateCost(d) +
                " - Capacity: " + getCapacity());
    }
}

class BusT extends TransportSys {
    public BusT(String n) { super(n); }
    public double calculateCost(double d) { return d * 2; }
    public int getCapacity() { return 40; }
}

class TaxiT extends TransportSys {
    public TaxiT(String n) { super(n); }
    public double calculateCost(double d) { return d * 5; }
    public int getCapacity() { return 4; }
}

class TrainT extends TransportSys {
    public TrainT(String n) { super(n); }
    public double calculateCost(double d) { return d * 1.5; }
    public int getCapacity() { return 200; }
}

