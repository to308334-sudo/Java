/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class PersonB8 {
    String name;
    PersonB8(String name) { this.name = name; }

    void introduce() {
        System.out.println("Xin chao, toi ten la " + name);
    }
}

class TeacherB8 extends PersonB8 {
    String subject;

    TeacherB8(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.println("Toi day mon " + subject);
    }
}


