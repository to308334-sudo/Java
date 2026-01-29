/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class BankAccount {
    String accountNumber, ownerName;
    double balance;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap account number: ");
        accountNumber = sc.nextLine();
        System.out.print("Nhap owner name: ");
        ownerName = sc.nextLine();
        System.out.print("Nhap balance: ");
        balance = sc.nextDouble();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance)
            return false;
        balance -= amount;
        return true;
    }

    public double checkBalance() {
        return balance;
    }

    public void display() {
        System.out.println("STK: " + accountNumber +
                " – Chu tai khoan: " + ownerName +
                " – So du: " + balance);
    }
}

