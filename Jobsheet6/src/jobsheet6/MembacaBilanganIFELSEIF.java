
package jobsheet6;

import java.util.Scanner;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class MembacaBilanganIFELSEIF {
    public static void main(String args[]){
        int angka;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan angka 1-10");
        angka = input.nextInt();
        
        if (angka >= 1 && angka <= 10){
            System.out.println("Valid number!!!");
        }else{
            System.out.println("Invalid Number");
        }
        System.out.println("angka yang dimasukkan adalah " + angka);
        
    }
}
