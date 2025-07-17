
package jobsheet5;

import java.util.Scanner;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class Scanner1 {
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan nama lengkap");
        String nama = in.nextLine();
        
        System.out.println("Masukkan nim");
        int nim = in.nextInt();
        
        System.out.println("Masukkan nilai");
        float nilai = in.nextFloat();
        
        System.out.println ("\nNama : " + nama +
                            "\nNim : " + nim +
                            "\nNilai:" + nilai);
    }
    
}
