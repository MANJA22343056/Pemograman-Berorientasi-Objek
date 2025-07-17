
package jobsheet10;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */

public class MobilUtama {
    public static void main (String []args){
        Mobil honda = new Mobil();
        honda.merk = "Civic";
        honda.warna = "Hitam";
        honda.tahunProduksi = 2020;
        System.out.println("Merk\t: honda.merk");
        System.out.println("Warna\t: honda.warna");
        System.out.println("Tahun\t: tahunproduksi");
        honda.Maju();
        honda.Maju();
        honda.Mundur();
        
    }
    
}
