/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Latihan3a.Latihan7_TestTime;

/*
Nama: Manja Fani Oktavia
Nim: 22343056
 */

import java.lang.Exception;

public class Latihan7_TestTime {

    public static void main(String[] args) {
        int hour = 24, minute = 58, second = 58;
        Time t12;

        try {
            t12 = new Time(second, minute, hour);
            System.out.println("Valid input");
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            System.out.println("Error in input. Set to default value");
            t12 = new Time();
        }

        System.out.println("Time is " + t12);
        System.out.println("Life goes on...");
    }
}
