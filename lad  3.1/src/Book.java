/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class Book {
    String title, author;
    double price;
    int year;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap title: ");
        title = sc.nextLine();
        System.out.print("Nhap author: ");
        author = sc.nextLine();
        System.out.print("Nhap price: ");
        price = sc.nextDouble();
        System.out.print("Nhap year: ");
        year = sc.nextInt();
    }

    public void display() {
        System.out.println("Title: " + title +
                " – Author: " + author +
                " – price: " + price +
                " – Year: " + year);
    }

    public boolean isExpensive() {
        return price > 200000;
    }

    public boolean isOldBook() {
        return year < 2015;
    }
}

