import java.util.Scanner;


public class Latihan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM : ");
        long npm = input.nextLong();

                long pembagi = 0;
        if (npm >= 2) {
            for (long i = 2; i * i <= npm; i++) {
                if (npm % i == 0) {
                    pembagi = i;
                    break;
                }
            }
        }

        if (npm < 2) {
            System.out.println("Bukan termasuk bilangan prima karena kurang dari 2");
        } else if (pembagi == 0) {
            System.out.println("Termasuk bilangan PRIMA");
        } else {
            System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan " + pembagi);
        }
    }
}
