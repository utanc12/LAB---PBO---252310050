package latihan;

import javax.swing.JOptionPane;

public class Latihan04 {

    static JOptionPane jop = new JOptionPane();

    // Menampilkan konfirmasi keluar. Return true jika user memilih YES
    static boolean konfirmasiKeluar() {
        int confirm = jop.showConfirmDialog(null, "Apakah anda ingin keluar ?",
                "Konfirmasi", jop.YES_NO_OPTION);
        return confirm == jop.YES_OPTION;
    }

    // Input dialog; jika CANCEL/close (x) -> tanya keluar, YES = program selesai
    static String inputWajib(String pesan) {
        while (true) {
            String hasil = jop.showInputDialog(null, pesan);
            if (hasil == null) {
                if (konfirmasiKeluar()) {
                    System.exit(0);
                }
                // NO -> kembali mengisi form tersebut
            } else {
                return hasil;
            }
        }
    }

    public static void main(String[] args) {
        Biodata bio = new Biodata();

        while (true) {
            String fullname;
            String usiaStr;
            String alamat;
            int usia;

            // Fullname
            while (true) {
                fullname = inputWajib("Masukkan fullname anda:");
                if (fullname.trim().isEmpty()) {
                    jop.showMessageDialog(null, "Field fullname tidak boleh kosong",
                            "Error", jop.ERROR_MESSAGE);
                } else {
                    break;
                }
            }

            // Usia
            while (true) {
                usiaStr = inputWajib("Masukkan usia anda:");
                if (usiaStr.trim().isEmpty()) {
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

            // Alamat
            while (true) {
                alamat = inputWajib("Masukkan alamat anda:");
                if (alamat.trim().isEmpty()) {
                    jop.showMessageDialog(null, "Field alamat tidak boleh kosong",
                            "Error", jop.ERROR_MESSAGE);
                } else if (alamat.trim().length() < 10) {
                    jop.showMessageDialog(null, "Masukan alamat minimum 10 karakter",
                            "Warning", jop.WARNING_MESSAGE);
                } else {
                    break;
                }
            }

            // Semua valid -> tampilkan info
            bio.simpanData(fullname.trim(), usia, alamat.trim());
            jop.showMessageDialog(null, bio.tampilkanData(),
                    "Informasi", jop.INFORMATION_MESSAGE);

            // Setelah OK -> tanya keluar; YES selesai, NO kembali ke Fullname
            if (konfirmasiKeluar()) {
                break;
            }
        }
    }
}