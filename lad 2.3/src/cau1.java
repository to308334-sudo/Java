/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        String hoten = sc.nextLine();

        System.out.print("Nhap nam sinh: ");
        int namsinh = sc.nextInt();

        int namHienTai = 2026; // có thể đổi theo năm hiện tại
        int tuoi = namHienTai - namsinh;

        System.out.println("Ho ten: " + hoten);
        System.out.println("Tuoi: " + tuoi);

        if (tuoi >= 18)
            System.out.println("Du tuoi lao dong");
        else
            System.out.println("Chua du tuoi lao dong");
    }
}
