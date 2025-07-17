
package jobsheet6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */

public class NilaiBufferedReader {
    public static void main(String args[]){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
       try{
       String  a, b, c;
       float nilai1, nilai2, nilai3, average;
        
        System.out.print("Masukkan nilai pertama ");
        a= dataIn.readLine();
        nilai1=Float.parseFloat(a);
        
        System.out.print("Masukkan nilai kedua ");
        b= dataIn.readLine();
        nilai2=Float.parseFloat(b);
        
        System.out.print("Masukkan nilai ketiga ");
        c= dataIn.readLine();
        nilai3=Float.parseFloat(c);
        
        average = (nilai1 + nilai2 + nilai3) /3;
       
        System.out.println("rata-rata nilai anda adalah :" +average);
            if (average >=60){
            System.out.println(":-)");
            }
            else {
            System.out.println(":-(");
            }
        } catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
    }
}