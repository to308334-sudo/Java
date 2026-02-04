/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class Employee2 {
String id, name;


public Employee2(String id, String name) {
this.id = id; this.name = name;
}
}


class Department {
String deptName;
Employee2 employee;


public void display() {
System.out.println(deptName + " - " + employee.id + " - " + employee.name);
}
}
