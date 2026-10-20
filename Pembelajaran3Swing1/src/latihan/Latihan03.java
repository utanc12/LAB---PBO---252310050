package latihan;

import javax.swing.JOptionPane;

public class Latihan03 {

    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();
        Biodata bio = new Biodata();

        String fullname;
        String usiaStr;
        String alamat;

        while (true) {
            fullname = jop.showInputDialog(null, "Masukkan fullname anda:");
            if (fullname == null || fullname.trim().isEmpty()) {
                jop.showMessageDialog(null, "Field fullname tidak boleh kosong",
                        "Error", jop.ERROR_MESSAGE);
            } else {
                break;
            }
        }

        int usia;
        while (true) {
            usiaStr = jop.showInputDialog(null, "Masukkan usia anda:");
            if (usiaStr == null || usiaStr.trim().isEmpty()) {
                jop.showMessageDialog(null, "Field usia tidak boleh kosong",
                        "Error", jop.ERROR_MESSAGE);
                continue;
            }
            try {
                usia = Integer.parseInt(usiaStr.trim());
                break;
            } catch (NumberFormatException e) {
                jop.showMessageDialog(null, "Isian usia harus angka",
                        "Error", jop.ERROR_MESSAGE);
            }
        }

        while (true) {
            alamat = jop.showInputDialog(null, "Masukkan alamat anda:");
            if (alamat == null || alamat.trim().isEmpty()) {
                jop.showMessageDialog(null, "Field alamat tidak boleh kosong",
                        "Error", jop.ERROR_MESSAGE);
            } else if (alamat.trim().length() < 10) {
                jop.showMessageDialog(null, "Masukan alamat minimum 10 karakter",
                        "Warning", jop.WARNING_MESSAGE);
            } else {
                break;
            }
        }

        bio.simpanData(fullname.trim(), usia, alamat.trim());
        jop.showMessageDialog(null, bio.tampilkanData(),
                "Informasi", jop.INFORMATION_MESSAGE);
    }
}