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

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tieu de: ");
        title = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        author = sc.nextLine();
        System.out.print("Nhap gia: ");
        price = sc.nextDouble();
        System.out.print("Nhap nam: ");
        year = sc.nextInt();
    }

    void display() {
        System.out.println("Title: " + title + " – Author: " + author +
                           " – Price: " + price + " – Year: " + year);
    }

    boolean isExpensive() {
        return price > 200000;
    }

    boolean isOldBook() {
        return year < 2015;
    }
}

