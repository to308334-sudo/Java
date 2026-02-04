/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class MainBai2 {
public static void main(String[] args) {
BankAccount acc = new BankAccount("001", "Tuan", 1000);
acc.displayInfo();
acc.deposit(500);
acc.displayInfo();
acc.withdraw(300);
acc.displayInfo();
}
}
