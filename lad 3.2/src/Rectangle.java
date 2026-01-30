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

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        length = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        width = sc.nextDouble();
    }

    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }

    void display() {
        System.out.println("Length: " + length + " - Width: " + width);
    }
}

