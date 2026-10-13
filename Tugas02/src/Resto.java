import java.util.Scanner;


public class Resto {

    private long Harga;

    private final Scanner input = new Scanner(System.in);

    public void chooseMenu() {
        System.out.println("Menu Sarapan:");
        System.out.println("    1. Nasi Goreng");
        System.out.println("    2. Bubur Ayam");
        System.out.println("    3. Soto Ayam");
        System.out.print("Pilih menu : ");

        int menu;
        try {
            menu = Integer.parseInt(input.nextLine().trim());
        } catch (NumberFormatException e) {
            menu = 0; 
        }

        long harga = getPrices(menu);

        switch (menu) {
            case 1:
                System.out.println("Anda memesan Nasi Goreng dengan harga " + rupiah(harga));
                break;
            case 2:
                System.out.println("Anda memesan Bubur Ayam dengan harga " + rupiah(harga));
                break;
            case 3:
                System.out.println("Anda memesan Soto Ayam dengan harga " + rupiah(harga));
                break;
            default:
                System.out.println("Maaf menu yang anda masukan salah.");
        }
    }

    private Long getPrices(int menu) {
        if (menu == 1) {
            Harga = 22000;
        } else if (menu == 2) {
            Harga = 15000;
        } else if (menu == 3) {
            Harga = 25000;
        } else {
            Harga = 0;
        }
        return Harga;
    }

    private static String rupiah(long nilai) {
        return "Rp " + String.format("%,d", nilai).replace(',', '.') + ",-";
    }
}
