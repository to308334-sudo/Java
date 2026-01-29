/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class Main_Bai8 {
    public static void main(String[] args) {
        Book bk = new Book();
        bk.input();
        bk.display();
        System.out.println("Expensive? " + bk.isExpensive());
        System.out.println("Old book? " + bk.isOldBook());
    }
}

