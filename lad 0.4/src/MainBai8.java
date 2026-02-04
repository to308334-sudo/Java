/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class MainBai8 {
public static void main(String[] args) {
Employee2 e = new Employee2("E01", "Tuan");
Department d = new Department();
d.deptName = "IT"; d.employee = e;
d.display();
}
}
