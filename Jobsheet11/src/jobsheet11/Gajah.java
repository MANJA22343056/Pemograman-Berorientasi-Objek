
package jobsheet11;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class Gajah extends Hewan{
    // meng-overwrite method pada class Hewan
    public static void testClassMethod(){
        System.out.println("The instance Method in Gajah");
    }
    
    public static void main (String args[]){
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();           
    }
      
}
