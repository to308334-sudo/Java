/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class Bai5 {
    public static void main(String[] args) {
        ElectricCarB5 e = new ElectricCarB5();
        e.brand = "Tesla";
        e.seatCount = 5;
        e.batteryCapacity = 100;

        e.start();
        System.out.println(e.brand + " - " + e.seatCount + " cho - " + e.batteryCapacity + " kWh");
    }
}
