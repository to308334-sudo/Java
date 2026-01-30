/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class TestBook {
    public static void main(String[] args) {
        Book b = new Book();
        b.input();
        b.display();

        if (b.isExpensive())
            System.out.println("Sach co gia cao");

        if (b.isOldBook())
            System.out.println("Sach xuat ban truoc nam 2015");
    }
}

