/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("123456", "Minh Tuan", 5000000);

        b.display();
        b.deposit(2000000);
        System.out.println("So du: " + b.checkBalance());

        b.withdraw(1000000);
        System.out.println("So du: " + b.checkBalance());
    }
}

