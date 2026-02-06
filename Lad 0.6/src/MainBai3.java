/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class MainBai3 {
    public static void main(String[] args) {
        VehicleSystem v1 = new CarSys("Toyota");
        VehicleSystem v2 = new MotorbikeSys("Honda");

        v1.showInfo();
        v2.showInfo();
    }
}

