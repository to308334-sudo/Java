/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.*;

public class b20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int target = new Random().nextInt(100)+1;
        int maxTry = 7;

        for(int i=1;i<=maxTry;i++){
            System.out.print("Doan lan "+i+": ");
            int x=sc.nextInt();

            if(x==target){
                System.out.println("Chinh xac! WIN");
                return;
            }
            else if(x<target) System.out.println("So lon hon!");
            else System.out.println("So nho hon!");
        }
        System.out.println("Het luot! So dung = "+target);
    }
}

