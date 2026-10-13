import java.util.Scanner;

	class Latihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap : ");
        String nama = input.nextLine();

        
        String hasil = nama.replaceAll("[aiueoAIUEO]", "X");

        System.out.println("Hasil                 : " + hasil);
    }
}
