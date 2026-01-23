/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class b15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] w=sc.nextLine().split(" ");
        for(String x:w){
            System.out.print(new StringBuilder(x).reverse()+" ");
        }
    }
}
