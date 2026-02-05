/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class PersonB1 {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Ten: " + name + ", Tuoi: " + age);
    }
}

class StudentB1 extends PersonB1 {
    String studentId;

    @Override
    void displayInfo() {
        System.out.println("Ten: " + name + ", Tuoi: " + age + ", MSSV: " + studentId);
    }
}

