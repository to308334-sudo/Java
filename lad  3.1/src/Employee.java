/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class Employee {
    String id, name;
    double salary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        id = sc.nextLine();
        System.out.print("Nhap name: ");
        name = sc.nextLine();
        System.out.print("Nhap salary: ");
        salary = sc.nextDouble();
    }

    public void display() {
        System.out.println("ID: " + id + " – Name: " + name + " – Salary: " + salary);
    }

    public double calculateTax() {
        if (salary > 10000000)
            return salary * 0.1;
        return 0;
    }
}

