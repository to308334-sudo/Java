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

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        id = sc.nextLine();
        System.out.print("Nhap name: ");
        name = sc.nextLine();
        System.out.print("Nhap price: ");
        price = sc.nextDouble();
        System.out.print("Nhap quantity: ");
        quantity = sc.nextInt();
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void discount(double percent) {
        price = price - price * percent / 100;
    }

    public void display() {
        System.out.println("id: " + id +
                " – Name: " + name +
                " – Price: " + price +
                " – Quantity: " + quantity);
    }
}

