/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Latihan3a.Latihan4_TestDate;

/*
Nama: Manja Fani Oktavia
Nim: 22343056
 */
public class Latihan4_TestDate {

    public static void main(String[] args) {
        // Test constructor and toString()
        Date d1 = new Date(2020, 2, 8);
        System.out.println(d1); // toString()
        // 02/08/2020

        // Test Setters and Getters
        d1.setYear(2012);
        d1.setMonth(12);
        d1.setDay(23);
        System.out.println(d1);
        // 12/23/2012
        System.out.println("Year is: " + d1.getYear());
        // Year is: 2012
        System.out.println("Month is: " + d1.getMonth());
        // Month is: 12
        System.out.println("Day is: " + d1.getDay());
        // Day is: 23

        // Test setDate()
        d1.setDate(2988, 1, 2);
        System.out.println(d1);
        // 01/02/2988
    }
}
