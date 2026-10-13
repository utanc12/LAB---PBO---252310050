import java.util.Scanner;


public class Latihan06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Usia      : ");
        String usia = input.nextLine();
        System.out.print("Masukkan Firstname : ");
        String firstname = input.nextLine();
        System.out.print("Masukkan Lastname  : ");
        String lastname = input.nextLine();
        System.out.print("Masukkan NPM       : ");
        String npm = input.nextLine();

        String hasil = usia.concat(firstname).concat(lastname).concat(npm);

        System.out.println("Output : " + hasil);
    }
}
