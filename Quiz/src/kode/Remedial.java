package kode;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Remedial {
    public static void main(String[] args) {
        ArrayList<Double> angka = new ArrayList<>();

        int data = Integer.parseInt(
            JOptionPane.showInputDialog("Masukkan total data:"));

        for (int i = 0; i < data; i++) {
            double n = Double.parseDouble(
                JOptionPane.showInputDialog("Masukan angka ke - " + (i + 1) + ":"));
            angka.add(n);
        }

        double total = 0;
        for (double n : angka) {
            total += n;
        }
        double rata2 = data > 0 ? total / angka.size() : 0;

        JOptionPane.showMessageDialog(null, "Rata-rata: " + rata2);
    }
}
