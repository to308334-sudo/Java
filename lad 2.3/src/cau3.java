/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap n (>0): ");
            n = sc.nextInt();
        } while (n <= 0);

        int tong = 0;
        long giaithua = 1;
        int demChan = 0;

        for (int i = 1; i <= n; i++) {
            tong += i;
            giaithua *= i;
            if (i % 2 == 0)
                demChan++;
        }

        System.out.println("Tong 1 -> n = " + tong);
        System.out.println("Giai thua n = " + giaithua);
        System.out.println("So luong so chan = " + demChan);
    }
}

