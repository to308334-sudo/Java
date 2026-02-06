/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
abstract class StaffSystem {
    String name;

    public StaffSystem(String name) {
        this.name = name;
    }

    public abstract double getIncome();

    public void showIncome() {
        System.out.println(name + " - Thu nhập: " + getIncome());
    }
}

class OfficeStaffS extends StaffSystem {
    double fixedSalary;

    public OfficeStaffS(String n, double s) {
        super(n);
        this.fixedSalary = s;
    }

    public double getIncome() { return fixedSalary; }
}

class SalesStaffS extends StaffSystem {
    double baseSalary, sales, rate;

    public SalesStaffS(String n, double b, double s, double r) {
        super(n);
        baseSalary = b;
        sales = s;
        rate = r;
    }

    public double getIncome() { return baseSalary + sales * rate; }
}

