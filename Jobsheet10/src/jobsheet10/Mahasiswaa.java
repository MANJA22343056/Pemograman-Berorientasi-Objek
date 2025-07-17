
package jobsheet10;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
    public class Mahasiswaa {
    String nama;
    int nim;
    int semester;
    double ip;

    public Mahasiswaa(String nama, int nim, int semester, double ip) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.ip = ip;
    }

    public int hitungSKS() {
        if (ip >= 3.5) {
            return 24;
        } else if (ip >= 3.0) {
            return 22;
        } else if (ip >= 2.5) {
            return 20;
        } else if (ip >= 2.0) {
            return 18;
        } else {
            return 15;
        }
    }
}

