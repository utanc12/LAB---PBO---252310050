package Tugas05;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan04 {

    public static void main(String[] args) {
        String[] kolom = {"Nama Lengkap", "Alamat", "No Telp"};

        ArrayList<ArrayList<String>> data = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            ArrayList<String> baris = new ArrayList<>();
            for (int j = 0; j < kolom.length; j++) {
                String input = JOptionPane.showInputDialog(
                        "Data ke-" + (i + 1) + "\nMasukkan " + kolom[j] + ":");
                baris.add(input);
            }
            data.add(baris);
        }

        // Untuk ngurutin namanya sesuai A-Z
        data.sort((a, b) -> a.get(0).compareToIgnoreCase(b.get(0)));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            sb.append("Data ke-").append(i + 1).append("\n");
            for (int j = 0; j < kolom.length; j++) {
                sb.append(kolom[j]).append("\t: ").append(data.get(i).get(j)).append("\n");
            }
            sb.append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(),
                "Data Terurut Ascending (Nama Lengkap)",
                JOptionPane.INFORMATION_MESSAGE);
    }
}