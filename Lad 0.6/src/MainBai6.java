/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class MainBai6 {
    public static void main(String[] args) {
        DeviceCore[] list = {
            new LaptopD("Laptop"),
            new AirConditionerD("Điều hòa"),
            new TelevisionD("TV")
        };

        double max = 0;
        for (DeviceCore d : list) {
            d.showPower();
            if (d.powerConsumption() > max) max = d.powerConsumption();
        }

        System.out.println("Thiết bị tiêu thụ nhiều nhất: " + max + "W");
    }
}

