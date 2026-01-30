/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.input();
        e.display();

        double tax = e.calculateTax();
        if (tax == 0)
            System.out.println("Khong phai dong thue");
        else
            System.out.println("Tien thue: " + tax);
    }
}

