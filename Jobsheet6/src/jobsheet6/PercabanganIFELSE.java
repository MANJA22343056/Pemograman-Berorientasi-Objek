
package jobsheet6;

import java.util.Scanner;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class PercabanganIFELSE {
     public static void main(String args[]){
        double totalPembelian, diskon=0;
        
        Scanner dataMasuk = new Scanner(System.in);
        System.out.print("Masukkan total pembelian: Rp ");
        totalPembelian =dataMasuk.nextDouble();
        
        if (totalPembelian >= 50000)
            diskon = 0.1 * totalPembelian;
        else
            diskon = 0.2 * totalPembelian;
            
        System.out.println("Besarnya diskon : Rp " + diskon);
    }
    
}

   
