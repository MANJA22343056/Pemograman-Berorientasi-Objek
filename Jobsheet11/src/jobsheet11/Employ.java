
package jobsheet11;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class Employ extends Person{
    private String noKaryawan;
    
    //konstruktor
    public Employ (String noKaryawan, String name, int age){
        super(name,age);
        this.noKaryawan = noKaryawan;
    }
    
    //metode
    public void info(){
        System.out.println("NO. Karyawan : " + this.noKaryawan);
        super.info();
    }
}
