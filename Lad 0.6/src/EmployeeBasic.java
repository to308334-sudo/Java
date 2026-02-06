/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
abstract class EmployeeBasic {
    String id, name;

    public EmployeeBasic(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();

    public void showInfo() {
        System.out.println(id + " - " + name + " - Lương: " + calculateSalary());
    }
}

class FullTimeEmp extends EmployeeBasic {
    double monthlySalary;

    public FullTimeEmp(String id, String name, double salary) {
        super(id, name);
        this.monthlySalary = salary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmp extends EmployeeBasic {
    int hours;
    double rate;

    public PartTimeEmp(String id, String name, int hours, double rate) {
        super(id, name);
        this.hours = hours;
        this.rate = rate;
    }

    public double calculateSalary() {
        return hours * rate;
    }
}

