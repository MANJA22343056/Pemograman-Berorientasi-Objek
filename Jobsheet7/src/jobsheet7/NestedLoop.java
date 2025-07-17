
package jobsheet7;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class NestedLoop {
    public static void main(String args []){
        int baris, kolom, hasil_kali;
        int MAKS= 8;
        
        for (baris = 1; baris <= MAKS; baris++){
            for (kolom = 1; kolom <= MAKS; kolom++)
               {
                hasil_kali= baris * kolom;
                System.out.println("\t "+ hasil_kali);
               }
            System.out.println("");
        }
    }
}
