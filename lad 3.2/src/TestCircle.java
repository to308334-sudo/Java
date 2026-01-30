/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.input();

        System.out.println("Dien tich: " + c.getArea());
        System.out.println("Chu vi: " + c.getPerimeter());

        if (c.isBigCircle())
            System.out.println("Hinh tron lon");
        else
            System.out.println("Hinh tron nho");
    }
}

