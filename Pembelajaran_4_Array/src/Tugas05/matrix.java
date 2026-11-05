package Tugas05;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class matrix {

    static ArrayList<ArrayList<Integer>> isiMatrix(String nama) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(
                        "Masukkan nilai matrix " + nama + "[" + i + "][" + j + "]:");
                baris.add(Integer.parseInt(input));
            }
            matrix.add(baris);
        }
        return matrix;
    }

    static String tampil(String nama, ArrayList<ArrayList<Integer>> matrix) {
        StringBuilder sb = new StringBuilder("Matrix " + nama + ":\n");
        for (ArrayList<Integer> baris : matrix) {
            for (int nilai : baris) {
                sb.append(nilai).append("   ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = isiMatrix("A"); // 1 3 9 5
        ArrayList<ArrayList<Integer>> B = isiMatrix("B"); // 4 5 3 6

        String hasil = tampil("A", A) + "\n" + tampil("B", B);
        JOptionPane.showMessageDialog(null, hasil, "Hasil Matrix 2x2",
                JOptionPane.INFORMATION_MESSAGE);
    }
}