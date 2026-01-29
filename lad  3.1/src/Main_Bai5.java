/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class Main_Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        b.input();
        b.display();

        System.out.print("Nhap so tien nap: ");
        b.deposit(sc.nextDouble());
        b.display();

        System.out.print("Nhap so tien rut: ");
        System.out.println("Rut thanh cong? " + b.withdraw(sc.nextDouble()));
        b.display();
    }
}

