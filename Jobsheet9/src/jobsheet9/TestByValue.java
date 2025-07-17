
package jobsheet9;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class TestByValue {
    public static void main(String args[]){
        int i = 10;
        System.out.println(i);
        
        test(i);
        System.out.println(i);

    }
    public static void test(int j){
        j = 33;
    }
}
