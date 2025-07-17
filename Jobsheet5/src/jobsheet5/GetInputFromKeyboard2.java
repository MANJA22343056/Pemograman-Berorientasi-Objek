
package jobsheet5;

import javax.swing.JOptionPane;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class GetInputFromKeyboard2 {
    public static void main(String args[]){
        String name ="", hoby="";
        
        name=JOptionPane.showInputDialog("Nama :");
        hoby=JOptionPane.showInputDialog("Hobi :");
        
        String msg= "Jadi hobi saya "+hoby+"." + "hobi yang bagus "
                + name;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi hobi saya "+hoby+". hobi yang bagus " + name);
    }    
    
}
