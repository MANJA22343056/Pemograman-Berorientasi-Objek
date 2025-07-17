
package jobsheet6;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class Grade {
    public static void main(String args[]){
        double grade = 95.0;
        
        if (grade >= 90){
            System.out.println("Excellent!");
        }
        /* Untuk menentukan kondisi yang mempunyai nilai
        rentangan maka tentukan nilai batas atas dan batas
        bawah setelah itu digabungkan dengan logika AND (&&)
        */
        else if((grade < 90)&& (grade >=80)){
            System.out.println("Good job!");
        }
         else if((grade < 80)&& (grade >=60)){
            System.out.println("Study harder!");
         }
        else {
            System.out.println("Sorry, you failed");
        }
        
    }
    
}
