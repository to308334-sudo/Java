/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int max=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for(int x:a){
            if(x>max){ second=max; max=x; }
            else if(x>second && x<max) second=x;
        }

        if(second==Integer.MIN_VALUE)
            System.out.println("Khong co so lon thu hai");
        else
            System.out.println("So lon thu hai = "+second);
    }
}
