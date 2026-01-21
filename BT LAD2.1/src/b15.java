/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
import java.util.Scanner;

public class b15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine(); 
        
        String topName = "";
        double topScore = -1;
        double sum = 0;
        
        for(int i = 1; i <= n; i++) {
            System.out.print("Tên sinh viên: ");
            String name = sc.nextLine();
            
            System.out.print("Điểm: ");
            double score = sc.nextDouble();
            sc.nextLine();
            
            sum += score;
            
            if(score > topScore) {
                topScore = score;
                topName = name;
            }
            
            String xepLoai;
            if(score >= 8.0) xepLoai = "Giỏi";
            else if(score >= 6.5) xepLoai = "Khá";
            else if(score >= 5.0) xepLoai = "Trung bình";
            else xepLoai = "Yếu";
            
            System.out.println("Xếp loại: " + xepLoai);
        }
        
        System.out.println("Điểm trung bình = " + (sum/n));
        System.out.println("Sinh viên cao điểm nhất: " + topName + " (" + topScore + ")");
    }
}
