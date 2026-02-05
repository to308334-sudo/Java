/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class Bai7 {
    public static void main(String[] args) {
        ShapeB7[] s = { new CircleB7(3), new RectangleB7(4,5) };
        for (ShapeB7 x : s)
            System.out.println(x.getArea());
    }
}
