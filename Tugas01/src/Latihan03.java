import java.util.Locale;
import java.util.Scanner;

 class Latihan03 {

    // ===== Class Variable =====
    static final double PI = 3.14159265358979;
    static String namaBangun;
    static double hasilLuas;
    static double hasilKeliling;
    static double hasilVolume;

    
    static double luasLayangLayang(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    static double kelilingLayangLayang(double a, double b) {
        return 2 * (a + b);
    }

    static void hitungLayangLayang(double d1, double d2, double a, double b) {
        namaBangun = "Layang-layang";
        hasilLuas = luasLayangLayang(d1, d2);
        hasilKeliling = kelilingLayangLayang(a, b);
        hasilVolume = 0;
    }

    static double luasAlasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    static void hitungPrismaSegitiga(double alas, double tinggiSegitiga, double tinggiPrisma) {
        // Local variable
        double sisiMiring = Math.sqrt(alas * alas + tinggiSegitiga * tinggiSegitiga);
        double kelilingAlas = alas + tinggiSegitiga + sisiMiring;
        double luasAlas = luasAlasSegitiga(alas, tinggiSegitiga);

        namaBangun = "Prisma Segitiga";
        hasilLuas = (2 * luasAlas) + (kelilingAlas * tinggiPrisma);
        hasilKeliling = kelilingAlas;                                
        hasilVolume = luasAlas * tinggiPrisma;
    }

        static double volumeKerucut(double r, double t) {
        return PI * r * r * t / 3;
    }

    static void hitungKerucut(double r, double t) {
        double garisPelukis = Math.sqrt(r * r + t * t);

        namaBangun = "Kerucut";
        hasilLuas = PI * r * (r + garisPelukis); 
        hasilKeliling = 2 * PI * r;              
        hasilVolume = volumeKerucut(r, t);
    }

        static double volumeTabung(double r, double t) {
        return PI * r * r * t;
    }

    static void hitungTabung(double r, double t) {
        namaBangun = "Tabung";
        hasilLuas = 2 * PI * r * (r + t); 
        hasilKeliling = 2 * PI * r;       
        hasilVolume = volumeTabung(r, t);
    }

        static void cetakHasil() {
        System.out.println("--------------------------------------");
        System.out.println("Bangun          : " + namaBangun);
        System.out.printf(Locale.US, "Luas            : %.2f%n", hasilLuas);
        System.out.printf(Locale.US, "Keliling        : %.2f%n", hasilKeliling);
        if (hasilVolume > 0) {
            System.out.printf(Locale.US, "Volume          : %.2f%n", hasilVolume);
        }
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan NPM : ");
        String npm = input.next();
        int digitTerakhir = npm.charAt(npm.length() - 1) - '0'; 

        if (digitTerakhir % 2 != 0) {
            System.out.println("NPM berakhir ganjil -> Kerucut dan Tabung");

            System.out.print("Jari-jari kerucut : ");
            double r = input.nextDouble();
            System.out.print("Tinggi kerucut    : ");
            double t = input.nextDouble();
            hitungKerucut(r, t);
            cetakHasil();

            System.out.print("Jari-jari tabung  : ");
            r = input.nextDouble();
            System.out.print("Tinggi tabung     : ");
            t = input.nextDouble();
            hitungTabung(r, t);
            cetakHasil();
        } else {
            System.out.println("NPM berakhir genap -> Layang-layang dan Prisma Segitiga");

            System.out.print("Diagonal 1 layang-layang : ");
            double d1 = input.nextDouble();
            System.out.print("Diagonal 2 layang-layang : ");
            double d2 = input.nextDouble();
            System.out.print("Sisi a layang-layang     : ");
            double a = input.nextDouble();
            System.out.print("Sisi b layang-layang     : ");
            double b = input.nextDouble();
            hitungLayangLayang(d1, d2, a, b);
            cetakHasil();

            System.out.print("Alas segitiga (siku-siku)   : ");
            double alas = input.nextDouble();
            System.out.print("Tinggi segitiga             : ");
            double tinggiSegitiga = input.nextDouble();
            System.out.print("Tinggi prisma               : ");
            double tinggiPrisma = input.nextDouble();
            hitungPrismaSegitiga(alas, tinggiSegitiga, tinggiPrisma);
            cetakHasil();
        }
    }
}
