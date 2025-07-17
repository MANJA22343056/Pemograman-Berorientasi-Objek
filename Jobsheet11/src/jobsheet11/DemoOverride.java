
package jobsheet11;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class DemoOverride {
    public static void main (String args []){
        B obj = new B();
        obj.setA(50);
        obj.setB(150);
        
        //akan memanggil method yag terdapat pada kelas B
        obj.tampilkanNilai();
    }
    
}
