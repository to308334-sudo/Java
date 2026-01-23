/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.*;

public class b7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] a1=new int[n1];
        for(int i=0;i<n1;i++) a1[i]=sc.nextInt();

        int n2=sc.nextInt();
        int[] a2=new int[n2];
        for(int i=0;i<n2;i++) a2[i]=sc.nextInt();

        Set<Integer> set=new LinkedHashSet<>();
        for(int x:a1) set.add(x);
        for(int x:a2) set.add(x);

        System.out.println(set);
    }
}
