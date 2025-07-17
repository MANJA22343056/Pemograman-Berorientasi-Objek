/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3a.Latihan1_TestCircle;

/*
Nama: Manja Fani Oktavia
Nim: 22343056
 */
public class Circle { // Save as "Circle.java"
   // Private instance variables
   private double radius;
   private String color;

   // Constructors (overloaded)
   /** Constructs a Circle instance with default radius and color */
   public Circle() { // 1st Constructor (default constructor)
      radius = 1.0;
      color = "red";
   }

   /** Constructs a Circle instance with the given radius and default color */
   public Circle(double r) { // 2nd Constructor
      radius = r;
      color = "red";
   }

   /** Constructs a Circle instance with the given radius and color */
   public Circle(double r, String c) { // 3rd Constructor
      radius = r;
      color = c;
   }

   // Public methods
   /** Returns the radius */
   public double getRadius() { // getter for radius
      return radius;
   }

   /** Returns the color */
   public String getColor() { // getter for color
      return color;
   }

   /** Returns the area of this circle */
   public double getArea() {
      return radius * radius * Math.PI;
   }
}
