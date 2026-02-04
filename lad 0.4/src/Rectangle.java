/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class Rectangle {
private double width, height;


public Rectangle() { width = height = 1; }
public Rectangle(double side) { width = height = side; }
public Rectangle(double w, double h) { width = w; height = h; }


public double getArea() { return width * height; }
}
