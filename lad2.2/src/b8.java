/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class b8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        boolean hoa=false, thuong=false, so=false, db=false;

        if(s.length()>=8){
            for(char c:s.toCharArray()){
                if(Character.isUpperCase(c)) hoa=true;
                else if(Character.isLowerCase(c)) thuong=true;
                else if(Character.isDigit(c)) so=true;
                else db=true;
            }
        }

        if(hoa && thuong && so && db) System.out.println("Mat khau manh");
        else System.out.println("Mat khau yeu");
    }
}
