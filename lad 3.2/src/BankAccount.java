/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class BankAccount {
    String accountNumber, ownerName;
    double balance;

    BankAccount(String acc, String owner, double bal) {
        accountNumber = acc;
        ownerName = owner;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Khong du tien!");
    }

    double checkBalance() {
        return balance;
    }

    void display() {
        System.out.println("STK: " + accountNumber + 
                           " – Chu tai khoan: " + ownerName + 
                           " – So du: " + balance);
    }
}

