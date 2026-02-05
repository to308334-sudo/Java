/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
abstract class EmployeeB10 {
    String id, name;

    EmployeeB10(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();
}

class OfficeEmployeeB10 extends EmployeeB10 {
    double fixedSalary;

    OfficeEmployeeB10(String id, String name, double s) {
        super(id, name);
        fixedSalary = s;
    }

    public double calculateSalary() { return fixedSalary; }
}

class SalesEmployeeB10 extends EmployeeB10 {
    double baseSalary, commission;

    SalesEmployeeB10(String id, String name, double b, double c) {
        super(id, name);
        baseSalary = b;
        commission = c;
    }

    public double calculateSalary() { return baseSalary + commission; }
}


