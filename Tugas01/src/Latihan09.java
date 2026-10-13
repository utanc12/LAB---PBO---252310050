import java.util.Locale;
import java.util.Scanner;


public class Latihan09 {
  
    Students myBio = new Students();

    public static void main(String[] args) {
        Latihan09 app = new Latihan09();
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan NPM          : ");
        Integer npm = app.myBio.getNPM(Integer.valueOf(input.nextLine().trim()));

        System.out.print("Masukkan Nama Lengkap : ");
        String nama = app.myBio.getFullname(input.nextLine());

        System.out.print("Masukkan Nama Kelas   : ");
        String kelas = app.myBio.getClassName(input.nextLine());

        System.out.print("Masukkan Semester     : ");
        Integer semester = app.myBio.getSemester(Integer.valueOf(input.nextLine().trim()));

        System.out.print("Masukkan IPK          : ");
        Float ipk = app.myBio.getGPA(Float.valueOf(input.nextLine().trim()));

        System.out.println("\n===== Data Mahasiswa =====");
        System.out.println("NPM          : " + npm);
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("Nama Kelas   : " + kelas);
        System.out.println("Semester     : " + semester);
        System.out.println("IPK          : " + ipk);
    }
}
