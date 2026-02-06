/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class MainBai8 {
    public static void main(String[] args) {
        GeoAdvanced[] list = {
            new RectA(3, 4),
            new SquareA(5),
            new CircleA(2)
        };

        for (GeoAdvanced g : list) {
            g.show();
            System.out.println();
        }
    }
}

