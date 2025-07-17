
package jobsheet10;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswaa mahasiswa = new Mahasiswaa("Manja", 22343056, 4, 3.90);

        System.out.println("Nama Mahasiswa\t: " + mahasiswa.nama);
        System.out.println("NIM\t\t: " + mahasiswa.nim);
        System.out.println("Semester\t: " + mahasiswa.semester);
        System.out.println("IP Semester ini\t: " + mahasiswa.ip);

        int sks = mahasiswa.hitungSKS();
        System.out.println("\nAnda berhak mengontrak " + sks + " SKS pada Semester " + mahasiswa.semester);
    }
}
    
