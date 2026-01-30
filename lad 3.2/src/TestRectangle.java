/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.input();
        r.display();
        System.out.println("Dien tich: " + r.getArea());
        System.out.println("Chu vi: " + r.getPerimeter());
    }
}

