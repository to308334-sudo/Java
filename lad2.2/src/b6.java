/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.*;

public class b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        Map<Integer,Integer> map=new HashMap<>();
        for(int x:a) map.put(x,map.getOrDefault(x,0)+1);

        int maxKey=a[0], maxVal=0;
        for(int k:map.keySet())
            if(map.get(k)>maxVal){
                maxVal=map.get(k);
                maxKey=k;
            }

        System.out.println("So: "+maxKey+"  So lan: "+maxVal);
    }
}

