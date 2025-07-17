
package jobsheet5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class GetInputFromKeyboard1 {
    public static void main(String args[]){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String name ="", hoby="";
        
        try{
            System.out.print("Nama :");
            name = dataIn.readLine();
            System.out.print("Hoby :");
            hoby = dataIn.readLine();
        }
        
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
        
        System.out.println("jadi hobi saya "+hoby
                +". hobi yang bagus " + name);
        
    }
        }
    

