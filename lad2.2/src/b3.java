/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n, sum=0;
        int digits = String.valueOf(n).length();

        while(temp>0){
            int d = temp%10;
            sum += Math.pow(d, digits);
            temp/=10;
        }

        if(sum==n) System.out.println("La so Armstrong");
        else System.out.println("Khong phai Armstrong");
    }
}

