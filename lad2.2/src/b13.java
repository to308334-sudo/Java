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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        s = s.replaceAll("\\s+", " ");
        String[] w=s.split(" ");
        StringBuilder kq=new StringBuilder();
        for(String x:w){
            kq.append(Character.toUpperCase(x.charAt(0)))
              .append(x.substring(1).toLowerCase())
              .append(" ");
        }
        System.out.println(kq.toString().trim());
    }
}

