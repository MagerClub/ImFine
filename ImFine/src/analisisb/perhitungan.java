/*
Nama Kelompok : LinuxTech
Anggota :   - Mikha Christian Satria Girsang (1810520086)
            - Lalu Advan Lavida (1810520094)
            - Muhammad Pandu Suryapranata (1810520091)
            - Vingkyn Fadillah (1810520084)
            - Fedi Fandawa (1810520060)
 */
package analisisb;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class perhitungan {

    public String[] convert(double[] a) {
        String[] jawabanpascon = new String[9];
        for (int i = 0; i < 9; i++) {
            if (a[i] == 1) {
                jawabanpascon[i] = "Ya";
            } else {
                jawabanpascon[i] = "Tidak";
            }
        }
        return jawabanpascon;
    }

    public double[] jaccard(double[][] a, double[] b) {
        double[] hasil = new double[27];

        for (int i = 0; i < 27; i++) {
            double satusatu = 1;
            double satunol = 0;
            double nolsatu = 0;
            double nolnol = 0;
            for (int j = 0; j < 9; j++) {
                if (b[j] == 1 && a[i][j] == 1) {
                    satusatu = satusatu + 1;
                } else if (b[j] == 1 && a[i][j] == 0) {
                    satunol = satunol + 1;
                } else if (b[j] == 0 && a[i][j] == 1) {
                    nolsatu = nolsatu + 1;
                } else if (b[j] == 0 && a[i][j] == 0) {
                    nolnol = nolnol + 1;
                }
            }
            double bawah = satusatu + satunol + nolsatu;
            double hitung = satusatu / bawah;
            hasil[i] = hitung;
        }
        return hasil;
    }

    public int indeks(double[] arr) {
        double max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    
}
