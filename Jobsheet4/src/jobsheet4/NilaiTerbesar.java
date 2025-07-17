
package jobsheet4;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class NilaiTerbesar {
    public static void main(String args[]){
        int a = 10;
        int b = 23;
        int c = 3;
        
        int nilaiTerbesar = ( a > b)? ( (a > c ) ? a : c): ( (b > c)? b : c);
        
        System.out.println("number a = " + a);
        System.out.println("number b = " + b);
        System.out.println("number c = " + c);
        System.out.println("nilai terbesar = " + nilaiTerbesar);
        
         
    }
}
