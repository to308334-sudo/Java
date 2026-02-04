/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class Employee {
private String id, name;
private double salary;


public Employee(String name) {
this.name = name;
this.salary = 0;
}


public Employee(String id, String name, double salary) {
this.id = id;
this.name = name;
this.salary = Math.max(0, salary);
}


public void display() {
System.out.println(id + " - " + name + " - Salary: " + salary);
}
}
