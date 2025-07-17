
package jobsheet10;

import java.util.Scanner;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class Manusia {
    String nama, tempatLahir,tglLahir;
    int beratBadan, tinggiBadan;
    
    public void inputdata(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nama lengkap\t");
        nama = input.nextLine();
        System.out.print("Masukkan tempat lahir\t");
        tempatLahir = input.nextLine();
        System.out.print("Masukkan tanggal lahir\t");
        tglLahir = input.nextLine();
        System.out.print("Masukkan berat badan\t");
        beratBadan = input.nextInt();
        System.out.print("Masukkan tinggi badan\t");
        tinggiBadan = input.nextInt();
    }
    
    public void identitas(){
        System.out.println("Nama saya\t" + nama);
        System.out.println("Tempat Lahir\t" + tempatLahir);
        System.out.println("Tanggal Lahir\t" + tglLahir);
        System.out.println("Berat Badan\t" + beratBadan + "kg");
        System.out.println("Tinggi badan\t" + tinggiBadan + "cm");
    }
    public static void main(String[] args){
        Manusia A = new Manusia();
        A.inputdata();
        A.identitas();
    }
}
