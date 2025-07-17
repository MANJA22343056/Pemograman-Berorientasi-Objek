
package jobsheet10;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class InformatikaUNP {
    public static void main(String args[]){
        Mahasiswa informatika = new Mahasiswa();
        Mahasiswa elektronika = new Mahasiswa();
        
        informatika.nama = "Happy Alicia";
        informatika.nim = 22343056;
        informatika.jur = "S1 Informatika";
        informatika.univ = "Universitas Negeri Padang";
        
        elektronika.nama = "Happy Alicia";
        elektronika.nim = 22343056;
        elektronika.jur = "S1 Informatika";
        elektronika.univ = "Universitas Negeri Padang";
        
        System.out.println("Data Mahasiswa Informatika");
        System.out.println("Nama: " + informatika.nama);
        System.out.println("NIM: " + informatika.nim);
        System.out.println("Jurusan: " + informatika.jur);
        System.out.println("Status: " + informatika.univ);
        
        System.out.println("==========================");
        
        System.out.println("Data Mahasiswa Elektronika");
        System.out.println("Nama: " + elektronika.nama);
        System.out.println("NIM: " + elektronika.nim);
        System.out.println("Jurusan: " + elektronika.jur);
        System.out.println("Status: " + elektronika.univ);
    }
    
}
