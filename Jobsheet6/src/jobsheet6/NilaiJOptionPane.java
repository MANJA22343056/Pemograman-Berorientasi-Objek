
package jobsheet6;

import javax.swing.JOptionPane;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class NilaiJOptionPane {
    public static void main(String args[]){
        String nilai1, nilai2, nilai3;
        float average;
        
        nilai1=JOptionPane.showInputDialog("enter nilai 1 : ");
        nilai2=JOptionPane.showInputDialog("enter nilai 2 : ");
        nilai3=JOptionPane.showInputDialog("enter nilai 3 : ");
        
        // Konversi nilai-nilai ke float
        float nilaiFloat1 = Float.parseFloat(nilai1);
        float nilaiFloat2 = Float.parseFloat(nilai2);
        float nilaiFloat3 = Float.parseFloat(nilai3);
        
        String msg= "Nilai 1: "+ nilai1 + " Nilai 2:  "
                + nilai2 + " Nilai 3:  " + nilai3;
        
        JOptionPane.showMessageDialog(null, msg);
       
        average = (nilaiFloat1 + nilaiFloat2 + nilaiFloat3) / 3;
        System.out.println("rata-rata nilai adalah" + average);
          if (average >=60){
            System.out.println(":-)");
            }
            else {
            System.out.println(":-(");
            }
    }
    
}
    
