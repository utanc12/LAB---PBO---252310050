import java.util.Scanner;


public class Latihan07 {
    public static void main(String[] args) {
        Resto resto = new Resto();
        Scanner input = new Scanner(System.in);
        String lagi;

        do {
            resto.chooseMenu();

            do {
                System.out.print("Apakah anda akan memesan kembali ? (y/n) : ");
                lagi = input.nextLine().trim().toLowerCase();
            } while (!lagi.equals("y") && !lagi.equals("n"));

            System.out.println();
        } while (lagi.equals("y"));

        System.out.println("Terimakasih telah memesan.");
    }
}
