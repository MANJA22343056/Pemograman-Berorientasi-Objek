
package jobsheet5;

import javax.swing.JOptionPane;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class Tugas2JOptionPane {
    public static void main(String args[]){
        String word1, word2 , word3;
        
        word1=JOptionPane.showInputDialog("enter word 1 : ");
        word2=JOptionPane.showInputDialog("enter word 2 : ");
        word3=JOptionPane.showInputDialog("enter word 3 : ");
        
        String msg= " "+ word1 + " "
                + word2 + " " + word3;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println(" "+ word1 + " "
                + word2 + " " + word3);
    }
    
}
