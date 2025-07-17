/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises.Exercise10_TestMain9;

/*
Nama: Manja Fani Oktavia
Nim: 22343056
 */

public class Customer {
    // Private instance variables
    private int id;
    private String name;
    private int discount;

    // Constructors
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // toString() method
    @Override
    public String toString() {
        return "Customer[id=" + id + ", name=" + name + ", discount=" + discount + "]";
    }
}