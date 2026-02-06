/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
public class MainBai9 {
    public static void main(String[] args) {
        double distance = 10;

        TransportSys[] list = {
            new BusT("Bus"),
            new TaxiT("Taxi"),
            new TrainT("Train")
        };

        double min = Double.MAX_VALUE;

        for (TransportSys t : list) {
            t.showInfo(distance);
            if (t.calculateCost(distance) < min)
                min = t.calculateCost(distance);
        }

        System.out.println("Chi phí thấp nhất: " + min);
    }
}

