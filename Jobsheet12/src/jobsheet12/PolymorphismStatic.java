
package jobsheet12;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */

class CompileTime {
    // method keliling dengan single argumen
    static int keliling(int a) {
        return 4 * a;
    }
    // method keliling dengan dua argumen (method overloading)
    static int keliling(int l, int b) {
        return 2 * (l + b);
    }
}

public class PolymorphismStatic {
    public static void main (String[] args) {
        // memanggil metode perimeter dengan satu argumen
        System.out.println("Sisi Persegi adalah : 4\nKeliling Persegi adalah: " 
                + CompileTime.keliling(4) + "\n");
        // memanggil metode perimeter dengan dua argumen
        System.out.println("Sisi Persegi Panjang adalah : 10, 13\nKeliling Persegi Panjang adalah : " 
                + CompileTime.keliling(10,13));
    }
}
