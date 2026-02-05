/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class AnimalB9 {
    public void makeSound() {
        System.out.println("Dong vat phat ra am thanh");
    }
}

class DogB9 extends AnimalB9 {
    public void makeSound() {
        System.out.println("Cho sua: Gau gau");
    }
}

class CatB9 extends AnimalB9 {
    public void makeSound() {
        System.out.println("Meo keu: Meo meo");
    }
}

