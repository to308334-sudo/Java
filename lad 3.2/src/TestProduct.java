/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class TestProduct {
    public static void main(String[] args) {
        Product p = new Product();
        p.input();
        p.display();

        System.out.println("Tong tien: " + p.getTotalPrice());
        p.discount(10);
        System.out.println("Sau giam gia:");
        p.display();
    }
}

