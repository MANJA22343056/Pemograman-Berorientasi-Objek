
package jobsheet7;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class TugasCetakAngkaNestedLoop {
    public static void main(String args[]){
        int x = 5; // jumlah baris yang diinginkan
        
        for (int i = 1 ; i <= x ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
