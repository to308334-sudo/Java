/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class Product {
    String id, name;
    double price;
    int quantity;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        System.out.print("Nhap ten SP: ");
        name = sc.nextLine();
        System.out.print("Nhap gia: ");
        price = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        quantity = sc.nextInt();
    }

    double getTotalPrice() {
        return price * quantity;
    }

    void discount(double percent) {
        price -= price * percent / 100;
    }

    void display() {
        System.out.println("ID: " + id + " – Name: " + name +
                           " – Price: " + price +
                           " – Quantity: " + quantity);
    }
}

