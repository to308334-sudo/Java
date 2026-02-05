/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class PersonB2 {
    String name;
    int age;

    PersonB2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class EmployeeB2 extends PersonB2 {
    double salary;

    EmployeeB2(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " - " + age + " - " + salary);
    }
}


