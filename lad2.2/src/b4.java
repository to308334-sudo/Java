/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int maxSum = a[0], curSum = a[0];
        for(int i=1;i<n;i++){
            curSum = Math.max(a[i], curSum+a[i]);
            maxSum = Math.max(maxSum, curSum);
        }
        System.out.println("Tong lon nhat = " + maxSum);
    }
}
