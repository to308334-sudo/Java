/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class b18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();

        int cheoChinh=0, cheoPhu=0;
        for(int i=0;i<n;i++){
            cheoChinh+=a[i][i];
            cheoPhu+=a[i][n-1-i];
        }

        System.out.println("Cheo chinh = "+cheoChinh);
        System.out.println("Cheo phu = "+cheoPhu);
    }
}
