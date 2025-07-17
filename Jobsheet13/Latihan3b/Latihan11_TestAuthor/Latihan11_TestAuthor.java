/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Latihan3b.Latihan11_TestAuthor;

/*
Nama: Manja Fani Oktavia
Nim: 22343056
 */
public class Latihan11_TestAuthor {

    public static void main(String[] args) {
        // Test constructor and toString()
        Author ahTeck = new Author("Tan Ah Teck", "teck@nowhere.com", 'm');
        System.out.println(ahTeck); // toString()
        // Tan Ah Teck (m) at teck@nowhere.com

        // Test Setters and Getters
        ahTeck.setEmail("teck@somewhere.com");
        System.out.println(ahTeck); // toString()
        // Tan Ah Teck (m) at teck@somewhere.com
        System.out.println("name is: " + ahTeck.getName());
        // name is: Tan Ah Teck
        System.out.println("gender is: " + ahTeck.getGender());
        // gender is: m
        System.out.println("email is: " + ahTeck.getEmail());
        // email is: teck@somewhere.com
    }
}