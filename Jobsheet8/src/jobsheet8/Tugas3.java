/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet8;

/**
 *
 * @author user
 */
public class Tugas3 {
         public static void main(String[] args) {
        String[][] bukuAlamat = {
            {"Florence", "735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Beycaa", "456-3322", "Manila"}
        };
        
        for (int i = 0; i < bukuAlamat.length; i++) {
            System.out.println("Nama: " + bukuAlamat[i][0]);
            System.out.println("Nomor Telepon: " + bukuAlamat[i][1]);
            System.out.println("Alamat: " + bukuAlamat[i][2]);
            System.out.println();
        }
    }
}

