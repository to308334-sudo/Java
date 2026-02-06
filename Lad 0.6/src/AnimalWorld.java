/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
abstract class AnimalWorld {
    String name;

    public AnimalWorld(String name) {
        this.name = name;
    }

    public abstract void makeSound();
    public abstract void move();

    public void show() {
        System.out.println("Con: " + name);
        makeSound();
        move();
        System.out.println();
    }
}

class DogW extends AnimalWorld {
    public DogW(String n) { super(n); }
    public void makeSound() { System.out.println("Gau gau"); }
    public void move() { System.out.println("Chay"); }
}

class CatW extends AnimalWorld {
    public CatW(String n) { super(n); }
    public void makeSound() { System.out.println("Meo meo"); }
    public void move() { System.out.println("Đi nhe"); }
}

class BirdW extends AnimalWorld {
    public BirdW(String n) { super(n); }
    public void makeSound() { System.out.println("Hot"); }
    public void move() { System.out.println("Bay"); }
}

