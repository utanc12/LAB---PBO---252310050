import java.util.Scanner;
import java.util.TreeSet;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM : ");
        String npm = input.nextLine().trim();
        int digitTerakhir = npm.charAt(npm.length() - 1) - '0';
        boolean genap = digitTerakhir % 2 == 0;

        long angka;
        do {
            System.out.print("Masukkan bilangan (minimal 20) : ");
            angka = Long.parseLong(input.nextLine().trim());
            if (angka < 20) {
                System.out.println("Nilai tidak boleh kurang dari 20!");
            }
        } while (angka < 20);

        TreeSet<Long> faktor = new TreeSet<>();
        for (long i = 1; i * i <= angka; i++) {
            if (angka % i == 0) {
                faktor.add(i);
                faktor.add(angka / i);
            }
        }

        StringBuilder hasil = new StringBuilder();
        if (genap) {
            for (long f : faktor) {
                if (hasil.length() > 0) hasil.append(", ");
                hasil.append(f);
            }
            System.out.println("ASC : Faktor " + angka + " adalah " + hasil);
        } else {
            for (long f : faktor.descendingSet()) {
                if (hasil.length() > 0) hasil.append(", ");
                hasil.append(f);
            }
            System.out.println("DESC : Faktor " + angka + " adalah " + hasil);
        }
    }
}
