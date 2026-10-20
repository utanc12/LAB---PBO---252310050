package latihan;

import javax.swing.JOptionPane;
public class Latihan02 {

    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();
        Biodata bio = new Biodata();

        String fullname = jop.showInputDialog(null, "Masukkan fullname anda:");
        String usiaStr = jop.showInputDialog(null, "Masukkan usia anda:");
        String alamat = jop.showInputDialog(null, "Masukkan alamat anda:");

        int usia = Integer.parseInt(usiaStr);
        bio.simpanData(fullname, usia, alamat);

        jop.showMessageDialog(null, bio.tampilkanData());
    }
}