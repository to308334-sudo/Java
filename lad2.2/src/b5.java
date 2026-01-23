/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        String rev = new StringBuilder(s).reverse().toString();
        if(s.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Khong phai Palindrome");
    }
}

