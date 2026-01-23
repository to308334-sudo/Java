/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class cau5 {

    public static void nhapMang(double[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap diem[" + i + "]: ");
            arr[i] = sc.nextDouble();
        }
    }

    public static void xuatMang(double[] arr) {
        System.out.print("Danh sach diem: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static double tinhDiemTrungBinh(double[] arr) {
        double tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];
        }
        return tong / arr.length;
    }

    public static String xepLoai(double dtb) {
        if (dtb >= 8.0) return "Gioi";
        else if (dtb >= 6.5) return "Kha";
        else if (dtb >= 5.0) return "Trung binh";
        else return "Yeu";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();

        double[] diem = new double[n];

        nhapMang(diem);
        xuatMang(diem);

        double dtb = tinhDiemTrungBinh(diem);
        System.out.println("Diem trung binh = " + dtb);
        System.out.println("Xep loai = " + xepLoai(dtb));
    }
}

