/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int tong = 0;
        int max = a[0];
        int demAm = 0;

        for (int i = 0; i < n; i++) {
            tong += a[i];
            if (a[i] > max) max = a[i];
            if (a[i] < 0) demAm++;
        }

        System.out.println("Tong cac phan tu = " + tong);
        System.out.println("Gia tri lon nhat = " + max);
        System.out.println("So phan tu am = " + demAm);
    }
}

