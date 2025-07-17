
package jobsheet12;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */

class Bank {
    float sukuBunga() {
        return 0;
    }
}

class BRI extends Bank {
    // overriding sukuBunga method
    float sukuBunga() {
        return 5.5f;
    }
}

class BNI extends Bank{
    // overriding sukuBunga method
    float sukuBunga() {
        return 10.6f;
    }
}

class Mandiri extends Bank{
    // overriding sukuBunga method
    float sukuBunga() {
        return 9.4f;
    }
}

public class PolymorphismDynamic {
    public static void main(String[] args) {
        // Creating variable of Bank class
        Bank B;
        B = new BRI();
        System.out.println("Tingkat suku Bunga BRI adalah: " + B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat suku Bunga BNI adalah: " + B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat suku Bunga Mandiri adalah: " + B.sukuBunga());
    }
}

