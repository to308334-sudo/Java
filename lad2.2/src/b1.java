/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

class SinhVien {
    String ma, ten;
    double diem;
}

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        SinhVien[] ds = new SinhVien[n];
        double sum = 0;

        for(int i=0;i<n;i++){
            ds[i] = new SinhVien();
            System.out.print("Ma: ");
            ds[i].ma = sc.nextLine();
            System.out.print("Ten: ");
            ds[i].ten = sc.nextLine();
            System.out.print("Diem: ");
            ds[i].diem = sc.nextDouble();
            sc.nextLine();
            sum += ds[i].diem;
        }

        System.out.println("Diem TB = " + sum/n);
        System.out.println("Sinh vien DAT:");
        for(SinhVien s: ds)
            if(s.diem >= 5)
                System.out.println(s.ma+" "+s.ten+" "+s.diem);

        System.out.println("Sinh vien KHONG DAT:");
        for(SinhVien s: ds)
            if(s.diem < 5)
                System.out.println(s.ma+" "+s.ten+" "+s.diem);
    }
}
