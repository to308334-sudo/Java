/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class Rectangle {
    double length, width;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap length: ");
        length = sc.nextDouble();
        System.out.print("Nhap width: ");
        width = sc.nextDouble();
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public void display() {
        System.out.println("Length: " + length + " – Width: " + width);
    }
}

