
package jobsheet8;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */

import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main(String[] args) {
        int[] angka = new int[10];

        for (int i = 0; i < 10; i++) {
            try {
                String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i + 1));
                angka[i] = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input tidak valid. Masukkan angka yang benar.");
                i--; // Jika input tidak valid, ulangi penginputan untuk indeks yang sama.
            }
        }

        int maxs = angka[0];
        for (int i = 1; i < 10; i++) {
            if (angka[i] > maxs) {
                maxs = angka[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Nomor terbesar adalah: " + maxs);
    }
}
