
package jobsheet5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class BufferedReader1 {
    public static void main(String args[]){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a,b;
        float angka1,angka2,jumlah;
        System.out.println("Program penjumlahan dua buah bilangan ");
        
        try{
            System.out.println("masukkan angka pertama ");
            a= dataIn.readLine();
            /* Data yang akan diproses aritmatika harus dikonversi
            dari tiga tipe data string ke tipe data angka yag diperlukan.
            Data yang diperoleh dari inputan kelas BufferedReader tipe 
            datanya selalu string
            */
            
            angka1=Float.parseFloat(a); //konversi dari string ke float
            
            System.out.print("Masukkan angka kedua ");
            b= dataIn.readLine();
            angka2=Float.parseFloat(b);
            
            jumlah =angka1+angka2;
            System.out.println("Jumlah :" +jumlah);
        }
        
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
            
        }
        
    
}
