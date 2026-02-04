/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class Address {
String street, city;


public Address(String s, String c) {
street = s; city = c;
}
}


class Student2 {
String id, name;
Address address;


public void display() {
System.out.println(id + " - " + name + " - " + address.street + ", " + address.city);
}
}
