/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class Main_Bai3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.input();
        e.display();
        System.out.println("Tax: " + e.calculateTax());
    }
}

