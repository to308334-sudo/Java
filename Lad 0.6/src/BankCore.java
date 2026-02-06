/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
abstract class BankCore {
    String acc;
    double balance;

    public BankCore(String acc, double balance) {
        this.acc = acc;
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public void deposit(double m) { balance += m; }
    public void withdraw(double m) { if (balance >= m) balance -= m; }
}
class SavingAcc extends BankCore {
    public SavingAcc(String a, double b) { super(a, b); }
    public double calculateInterest() { return balance * 0.05; }
}
class CheckingAcc extends BankCore {
    public CheckingAcc(String a, double b) { super(a, b); }
    public double calculateInterest() { return balance * 0.01; }
}

