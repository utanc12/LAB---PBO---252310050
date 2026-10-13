import java.util.Scanner;


public class Latihan05 {

    static int jumlahBintang(int r, int n) {
        return (r < n) ? n - r : r - n + 1;
    }

    static boolean bintang(int c, int k, int n) {
        return c < k || c >= (2 * n + 1) - k;
    }

    static void cetakDenganFor(int n) {
        for (int r = 0; r < 2 * n; r++) {
            int k = jumlahBintang(r, n);
            StringBuilder baris = new StringBuilder();
            for (int c = 0; c < 2 * n + 1; c++) {
                baris.append(bintang(c, k, n) ? "* " : "  ");
            }
            System.out.println(baris.toString().stripTrailing());
        }
    }

    static void cetakDenganWhile(int n) {
        int r = 0;
        while (r < 2 * n) {
            int k = jumlahBintang(r, n);
            StringBuilder baris = new StringBuilder();
            int c = 0;
            while (c < 2 * n + 1) {
                baris.append(bintang(c, k, n) ? "* " : "  ");
                c++;
            }
            System.out.println(baris.toString().stripTrailing());
            r++;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM : ");
        String npm = input.nextLine().trim();
        int digitTerakhir = npm.charAt(npm.length() - 1) - '0';

        System.out.print("Enter the number of row : ");
        int n = Integer.parseInt(input.nextLine().trim());

        if (digitTerakhir % 2 != 0) {
            System.out.println("(NPM ganjil -> WHILE)");
            cetakDenganWhile(n);
        } else {
            System.out.println("(NPM genap -> FOR)");
            cetakDenganFor(n);
        }
    }
}
