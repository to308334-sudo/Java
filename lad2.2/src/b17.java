/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.*;

public class b17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> chan=new ArrayList<>();
        List<Integer> le=new ArrayList<>();

        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x%2==0) chan.add(x);
            else le.add(x);
        }

        System.out.println("Chan: "+chan);
        System.out.println("Le: "+le);
    }
}

