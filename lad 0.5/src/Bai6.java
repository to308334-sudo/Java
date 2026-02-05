/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */

public class Bai6 {
    public static void main(String[] args) {
        EmployeeB6[] arr = {
            new FullTimeEmployeeB6(5000),
            new PartTimeEmployeeB6(20, 50)
        };

        for (EmployeeB6 e : arr)
            System.out.println(e.getSalary());
    }
}
