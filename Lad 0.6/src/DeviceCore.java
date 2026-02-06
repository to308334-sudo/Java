/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
abstract class DeviceCore {
    String deviceName;

    public DeviceCore(String name) {
        this.deviceName = name;
    }

    public abstract double powerConsumption();

    public void showPower() {
        System.out.println(deviceName + " - Công suất: " + powerConsumption() + "W");
    }
}

class LaptopD extends DeviceCore {
    public LaptopD(String n) { super(n); }
    public double powerConsumption() { return 65; }
}

class AirConditionerD extends DeviceCore {
    public AirConditionerD(String n) { super(n); }
    public double powerConsumption() { return 1200; }
}

class TelevisionD extends DeviceCore {
    public TelevisionD(String n) { super(n); }
    public double powerConsumption() { return 150; }
}

