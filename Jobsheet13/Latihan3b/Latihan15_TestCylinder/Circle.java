/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3b.Latihan15_TestCylinder;

/*
Nama: Manja Fani Oktavia
Nim: 22343056
 */

public class Circle {
    // private instance variables
    private double radius;
    private String color;

    // Constructors
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Constructed a Circle with Circle()");
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
        System.out.println("Constructed a Circle with Circle(radius)");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Constructed a Circle with Circle(radius, color)");
    }

    // Getter and Setter for radius
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for color
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /** Returns the area of this Circle */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /** Returns a self-descriptive String */
    public String toString() {
        return "This is a Circle";
    }
}