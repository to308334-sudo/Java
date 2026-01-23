/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENU =====");
        System.out.println("1. Tinh tong 2 so");
        System.out.println("2. Tinh hieu 2 so");
        System.out.println("3. Tinh tich 2 so");
        System.out.println("4. Tinh thuong 2 so");
        System.out.print("Chon chuc nang: ");
        int chon = sc.nextInt();

        System.out.print("Nhap so a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap so b: ");
        double b = sc.nextDouble();

        switch (chon) {
            case 1:
                System.out.println("Tong = " + (a + b));
                break;
            case 2:
                System.out.println("Hieu = " + (a - b));
                break;
            case 3:
                System.out.println("Tich = " + (a * b));
                break;
            case 4:
                if (b == 0)
                    System.out.println("Loi: Khong the chia cho 0");
                else
                    System.out.println("Thuong = " + (a / b));
                break;
            default:
                System.out.println("Chon sai!");
        }
    }
}
