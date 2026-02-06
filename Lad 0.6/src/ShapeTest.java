/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public void display() {
        System.out.println("Hình: " + name);
        System.out.println("Diện tích: " + area());
        System.out.println("-------------------");
    }
}

class Rectangle extends Shape {
    double width, height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

