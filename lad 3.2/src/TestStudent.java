/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class TestStudent {
    public static void main(String[] args) {
        Student st = new Student();
        st.input();
        st.display();

        if (st.isPass())
            System.out.println("Sinh vien DAT");
        else
            System.out.println("Sinh vien KHONG DAT");
    }
}

