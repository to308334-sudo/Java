/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
abstract class ShapeB7 {
    public abstract double getArea();
}

class CircleB7 extends ShapeB7 {
    double r;
    CircleB7(double r) { this.r = r; }
    public double getArea() { return Math.PI * r * r; }
}

class RectangleB7 extends ShapeB7 {
    double w, h;
    RectangleB7(double w, double h) { this.w = w; this.h = h; }
    public double getArea() { return w * h; }
}


