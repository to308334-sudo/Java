/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class b14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        if(s.isEmpty()) System.out.println("0");
        else{
            s = s.replaceAll("\\s+"," ");
            System.out.println("So tu = "+ s.split(" ").length);
        }
    }
}

