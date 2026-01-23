/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class b19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(), n=sc.nextInt();
        int[][] a=new int[m][n];

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();

        System.out.println("Ma tran chuyen vi:");
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}
