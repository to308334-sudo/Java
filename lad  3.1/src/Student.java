/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class Student {
    String id, name;
    double score;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        id = sc.nextLine();
        System.out.print("Nhap name: ");
        name = sc.nextLine();
        System.out.print("Nhap score: ");
        score = sc.nextDouble();
    }

    public void display() {
        System.out.println("ID: " + id + " – Name: " + name + " – Score: " + score);
    }

    public boolean isPass() {
        return score >= 5;
    }
}

