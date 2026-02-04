/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class Book {
private String id, title;
private double price;


public Book() { price = 0; }


public Book(String id, String title, double price) {
this.id = id;
this.title = title;
this.price = price;
}


public void display() {
System.out.println(id + " - " + title + " - Price: " + price);
}
}
