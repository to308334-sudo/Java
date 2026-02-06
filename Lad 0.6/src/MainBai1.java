/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.ArrayList;

public class MainBai1 {
    public static void main(String[] args) {

        ArrayList<Shape> list = new ArrayList<>();

        list.add(new Rectangle("Hinh chu nhật 1", 4, 5));
        list.add(new Rectangle("Hinh chu nhật 2", 3, 6));
        list.add(new Circle("Hinh tron", 2.5));

        for (Shape s : list) {
            s.display();
        }
    }
}

