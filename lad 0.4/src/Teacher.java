/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class Teacher {
private String name, specialization;


public Teacher(String n, String s) { name = n; specialization = s; }


public String getName() { return name; }
public String getSpecialization() { return specialization; }
}


class ClassRoom {
private String className;
private Teacher teacher;


public ClassRoom(String className) { this.className = className; }


public ClassRoom(String className, Teacher teacher) {
this.className = className;
this.teacher = teacher;
}


public void display() {
if (teacher != null)
System.out.println(className + " - " + teacher.getName() + " - " + teacher.getSpecialization());
else
System.out.println(className + " - No teacher");
}
}
