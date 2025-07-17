
package jobsheet11;


public class Bus2 {
        public int penumpang;
    public int maxPenumpang;
    
    public Bus2(int maxpenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else {
            this.penumpang = temp;
        }
    }
    public void cetak (){
        System.out.println("Penumpang bus sekarang" + penumpang);
        System.out.println("Penumpang maks seharusnya" + maxPenumpang);
        
    }
}

