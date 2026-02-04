/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class CPU {
String brand;
double speed;


public CPU(String b, double s) { brand = b; speed = s; }
}


class Computer {
String model;
CPU cpu;


public Computer(String m, CPU c) { model = m; cpu = c; }


public void displayInfo() {
System.out.println(model + " - " + cpu.brand + " - " + cpu.speed + "GHz");
}
}
