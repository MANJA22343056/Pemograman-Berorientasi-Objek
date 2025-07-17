
package jobsheet11;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class UjiBus2 {
        public static void main(String args[]) {
        Bus2 busBesar = new Bus2 (40);
        busBesar.cetak();
        
        busBesar.addpenumpang(15);
        busBesar.cetak();
        
        busBesar.addpenumpang(5);
        busBesar.cetak();
        
        busBesar.addpenumpang(26);
        busBesar.cetak();
    }
    
}

