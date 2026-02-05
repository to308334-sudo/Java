/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class EmployeeB6 {
    double getSalary() { return 0; }
}

class FullTimeEmployeeB6 extends EmployeeB6 {
    double salary;
    FullTimeEmployeeB6(double s) { salary = s; }
    double getSalary() { return salary; }
}

class PartTimeEmployeeB6 extends EmployeeB6 {
    double hours, rate;
    PartTimeEmployeeB6(double h, double r) { hours = h; rate = r; }
    double getSalary() { return hours * rate; }
}


