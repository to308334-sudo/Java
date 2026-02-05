/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class AnimalB3 {
    protected String name;

    void sound() {
        System.out.println("Dong vat phat ra am thanh");
    }
}

class DogB3 extends AnimalB3 {
    @Override
    void sound() {
        System.out.println(name + " sua: Gau gau");
    }
}

