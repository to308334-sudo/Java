/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
abstract class PaymentCore {
    String methodName;

    public PaymentCore(String name) {
        this.methodName = name;
    }

    public abstract boolean pay(double amount);

    public void printReceipt(double amount) {
        System.out.println(methodName + " thanh toán: " + amount);
    }
}

class CashP extends PaymentCore {
    public CashP() { super("Cash"); }
    public boolean pay(double a) { return true; }
}

class CreditCardP extends PaymentCore {
    public CreditCardP() { super("Credit Card"); }
    public boolean pay(double a) { return a <= 5000; }
}

class EwalletP extends PaymentCore {
    public EwalletP() { super("E-Wallet"); }
    public boolean pay(double a) { return a <= 3000; }
}

