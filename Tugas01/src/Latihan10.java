import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;


public class Latihan10 {

    static String rupiah(long nilai) {
        return "Rp " + String.format(Locale.US, "%,d", nilai).replace(',', '.') + ",-";
    }

    public static void main(String[] args) {
        final String namaProduk = "ROTI ENAK.";
        final long hargaSatuan = 6300;

        Scanner input = new Scanner(System.in);
        Students myBio = new Students();

        System.out.print("Masukan nama member               : ");
        String namaMember = myBio.getFullname(input.nextLine());

        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = Integer.parseInt(input.nextLine().trim());

        int persenDiskon = (qty / 3) * 5;
        long total = hargaSatuan * qty;
        long subTotal = total - (total * persenDiskon / 100);

        String waktu = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)", Locale.ENGLISH));

        String garis = "=".repeat(54);
        System.out.println();
        System.out.println(garis);
        System.out.println("                TOKO SERBAGUNA IBIK");
        System.out.println(garis);
        System.out.println("Masukan jumlah produk yang dibeli : " + qty);
        System.out.println();
        System.out.println(waktu);
        System.out.printf("%-16s%-8s%-14s%s%n", "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.println(garis);
        System.out.printf("%-16s%-8d%-14s%s%n", namaProduk, qty, rupiah(hargaSatuan), rupiah(total));
        System.out.println("-".repeat(54));
        System.out.println("Diskon : " + persenDiskon + "%");
        System.out.println("Sub Total : " + rupiah(subTotal));
        System.out.println("Member Name : " + namaMember);
    }
}
