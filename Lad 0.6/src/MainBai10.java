/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class MainBai10 {
    public static void main(String[] args) {
        double amount = 2500;

        PaymentCore[] list = {
            new CashP(),
            new CreditCardP(),
            new EwalletP()
        };

        for (PaymentCore p : list) {
            if (p.pay(amount)) {
                System.out.println("Thanh toán thành công");
                p.printReceipt(amount);
            } else {
                System.out.println("Thanh toán thất bại với " + p.methodName);
            }
        }
    }
}

