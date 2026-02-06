/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class MainBai4 {
    public static void main(String[] args) {
        AnimalWorld[] list = {
            new DogW("Cho"),
            new CatW("Meo"),
            new BirdW("Chim")
        };

        for (AnimalWorld a : list) a.show();
    }
}

