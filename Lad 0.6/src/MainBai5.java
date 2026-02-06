/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class MainBai5 {
    public static void main(String[] args) {
        BankCore s = new SavingAcc("001", 1000);
        BankCore c = new CheckingAcc("002", 1000);

        s.deposit(500);
        c.withdraw(200);

        System.out.println("Saving: " + s.calculateInterest());
        System.out.println("Checking: " + c.calculateInterest());
    }
}
