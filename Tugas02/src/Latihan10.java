import java.util.Scanner;


public class Latihan10 {

    static final String NPM = "252310050";

    static String rupiah(long nilai) {
        return "Rp " + String.format("%,d", nilai).replace(',', '.') + ",-";
    }

    static long bacaNominal(Scanner input, String label) {
        System.out.print(label);
        try {
            long nominal = Long.parseLong(input.nextLine().trim().replace(".", ""));
            return nominal > 0 ? nominal : -1;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long saldo = 1000000; 

        String pin;
        do {
            System.out.print("Masukkan PIN : ");
            pin = input.nextLine().trim();
            if (!pin.equals(NPM)) {
                System.out.println("PIN salah, silakan coba lagi.");
            }
        } while (!pin.equals(NPM));

        String lanjut;
        do {
            System.out.println();
            System.out.println("===== MENU ATM =====");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");
            String menu = input.nextLine().trim();

            boolean tampilSaldo = false;
            switch (menu) {
                case "1": // Lihat Saldo
                    tampilSaldo = true;
                    break;
                case "2": { // Setor Tunai
                    long setor = bacaNominal(input, "Masukkan nominal setor tunai : ");
                    if (setor < 0) {
                        System.out.println("Nominal tidak valid.");
                    } else {
                        saldo += setor; 
                        tampilSaldo = true;
                    }
                    break;
                }
                case "3": { // Tarik Tunai
                    long tarik = bacaNominal(input, "Masukkan nominal tarik tunai : ");
                    if (tarik < 0) {
                        System.out.println("Nominal tidak valid.");
                    } else if (tarik <= saldo) { 
                        saldo -= tarik;          
                        tampilSaldo = true;
                    } else {
                        System.out.println("Saldo tidak cukup");
                    }
                    break;
                }
                case "4":
                    break;
                default:
                    System.out.println("Menu yang anda masukan salah.");
                    lanjut = "y";
                    continue; 
            }

            if (tampilSaldo) {
                System.out.println("Saldo anda : " + rupiah(saldo));
            }

            do {
                System.out.print("Apakah anda ingin melanjutkan transaksi ? (y/n) : ");
                lanjut = input.nextLine().trim().toLowerCase();
            } while (!lanjut.equals("y") && !lanjut.equals("n"));
        } while (lanjut.equals("y"));

        System.out.println("Terimakasih.");
    }
}
