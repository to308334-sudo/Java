/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class b12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int max = a[0], min = a[0];
        
        for(int i = 1; i < n; i++) {
            if(a[i] > max) max = a[i];
            if(a[i] < min) min = a[i];
        }
        
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}

