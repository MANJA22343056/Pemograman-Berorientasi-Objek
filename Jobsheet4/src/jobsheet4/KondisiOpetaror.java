
package jobsheet4;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class KondisiOpetaror {
    public static void main(String args[]){
        String status ="";
        int grade =50;
        
        //mendapatkan status pelajar
        status = (grade >= 60) ? "Passed" : "Fail";
        
        //print status
        System.out.println(status);
    }
}
