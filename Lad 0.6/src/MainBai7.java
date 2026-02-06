/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class MainBai7 {
    public static void main(String[] args) {
        StaffSystem[] list = {
            new OfficeStaffS("Lan", 7000),
            new SalesStaffS("Minh", 4000, 20000, 0.1)
        };

        double total = 0;
        for (StaffSystem s : list) {
            s.showIncome();
            total += s.getIncome();
        }

        System.out.println("Tổng thu nhập công ty: " + total);
    }
}

