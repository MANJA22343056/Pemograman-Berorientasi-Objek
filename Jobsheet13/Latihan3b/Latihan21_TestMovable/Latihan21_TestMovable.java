/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Latihan3b.Latihan21_TestMovable;

/*
Nama: Manja Fani Oktavia
Nim: 22343056
 */
public class Latihan21_TestMovable {

    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(1, 2);
        System.out.println(p1);
        // (1,2)
        p1.moveDown();
        System.out.println(p1);
        // (1,3)
        p1.moveRight();
        System.out.println(p1);
        // (2,3)

        // Test Polymorphism
        Movable p2 = new MovablePoint(3, 4); // upcast
        p2.moveUp();
        System.out.println(p2);
        // (3,3)

        MovablePoint p3 = (MovablePoint) p2; // downcast
        System.out.println(p3);
        // (3,3)
    }
}
