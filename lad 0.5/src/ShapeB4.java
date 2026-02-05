/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class ShapeB4 {
    double getArea() {
        return 0;
    }
}

class RectangleB4 extends ShapeB4 {
    double width, height;

    RectangleB4(double w, double h) {
        width = w;
        height = h;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

