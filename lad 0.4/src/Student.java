/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUAN PC
 */
class Student {
private String id, name;
private double score;


public String getId() { return id; }
public void setId(String id) { this.id = id; }


public String getName() { return name; }
public void setName(String name) { this.name = name; }


public double getScore() { return score; }
public void setScore(double score) { this.score = score; }


public boolean isPass() { return score >= 5; }


public void display() {
System.out.println(id + " - " + name + " - Score: " + score + " - Pass: " + isPass());
}
}
