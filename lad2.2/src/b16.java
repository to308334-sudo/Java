/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class b16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();

        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(a[i]+a[j]==k)
                    System.out.println("(" + a[i] + "," + a[j] + ")");
    }
}

