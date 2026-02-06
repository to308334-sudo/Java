/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
abstract class GeoAdvanced {
    public abstract double getArea();
    public abstract double getPerimeter();

    public void show() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

class RectA extends GeoAdvanced {
    double w, h;
    public RectA(double w, double h) { this.w = w; this.h = h; }

    public double getArea() { return w * h; }
    public double getPerimeter() { return 2 * (w + h); }
}

class SquareA extends GeoAdvanced {
    double a;
    public SquareA(double a) { this.a = a; }

    public double getArea() { return a * a; }
    public double getPerimeter() { return 4 * a; }
}

class CircleA extends GeoAdvanced {
    double r;
    public CircleA(double r) { this.r = r; }

    public double getArea() { return Math.PI * r * r; }
    public double getPerimeter() { return 2 * Math.PI * r; }
}

