/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class MainBai2 {
    public static void main(String[] args) {
        EmployeeBasic a = new FullTimeEmp("F01", "An", 8000);
        EmployeeBasic b = new PartTimeEmp("P01", "Binh", 50, 50);

        a.showInfo();
        b.showInfo();
    }
}

