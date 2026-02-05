/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class Bai10 {
    public static void main(String[] args) {
        EmployeeB10[] arr = {
            new OfficeEmployeeB10("E1","Tuan",5000),
            new SalesEmployeeB10("E2","An",3000,1500)
        };

        double total = 0;
        for (EmployeeB10 e : arr) {
            double s = e.calculateSalary();
            System.out.println(s);
            total += s;
        }
        System.out.println("Tong luong: " + total);
    }
}