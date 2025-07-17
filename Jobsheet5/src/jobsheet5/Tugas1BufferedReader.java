package jobsheet5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class Tugas1BufferedReader {
    public static void main(String args[]){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
       try{
       String word1, word2, word3;
        
       System.out.print("enter word1 : ");
       word1 = dataIn.readLine();
       
       System.out.print("enter word2 : ");
       word2 =  dataIn.readLine();
       
       System.out.print("enter word3 : ");
       word3 = dataIn.readLine();
       
       
       System.out.println(word1 + " " + word2 + " " + word3);
    
       }
       
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
    }
       
}