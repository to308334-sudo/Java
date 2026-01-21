/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class b13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String reversed = "";
        for(int i = s.length()-1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        
        System.out.println("Chuỗi đảo: " + reversed);
    }
}
