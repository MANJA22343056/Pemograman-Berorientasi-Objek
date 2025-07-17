
package jobsheet11;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class B extends A{
    private int b;
    
    public void setB (int nilai){
        b = nilai;
    }
    
    public int getB(){
        return b;
    }
    //melakukan override terhadap tampilkanNilai()
    //terhadap kelas A
    public void tampilkanNilai(){
        super.tampilkanNilai();//memanggil method dalam kelas A
        System.out.println("Nilai b = " + getB());
    }
    
}
