/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class BankAccount {
private String accountNumber, ownerName;
private double balance;


public BankAccount(String acc, String owner, double bal) {
accountNumber = acc;
ownerName = owner;
balance = Math.max(0, bal);
}


public void deposit(double amount) {
if (amount > 0) balance += amount;
}


public void withdraw(double amount) {
if (amount > 0 && amount <= balance) balance -= amount;
}


public void displayInfo() {
System.out.println(accountNumber + " - " + ownerName + " - Balance: " + balance);
}
}
