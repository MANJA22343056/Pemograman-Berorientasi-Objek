
package jobsheet12;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */

abstract class Orang {
    public String namaAyah = "Randi Proska";
    
    abstract void makan();
    
    public void minum() {
        System.out.println("Minum Air Teh dan Kopi");
    }
}

class AnakUmur1Tahun extends Orang {
    
    public void namaAyahKu() {
        System.out.println("Nama Ayahku adalah " + namaAyah);
    }
    
    @Override
    public void makan() {
        System.out.println("Anak Umur 1 Tahun Makan Asi");
    }
    
    @Override
    public void minum() {
        System.out.println("Anak Umur 1 Tahun Minum Asi");
    }
}

public class manusia {
    public static void main(String args[]) {
        // Object induk tidak bisa dibuat di sini
        
        // Buat object anak umur 1 tahun baru
        AnakUmur1Tahun a1 = new AnakUmur1Tahun();
        
        // Panggil method anak umur 1 tahun
        a1.makan();
        a1.minum();
        a1.namaAyahKu();
    }
}
