package praktikum_1;

import java.util.Scanner;

public class Latihan1 {
	public static void main(String[] args) {
		System.out.println("Program Menghitung Volume Balok");
		
		Balok balok = new Balok();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukan Panjang balok: ");
		balok.panjang = scanner.nextDouble();
		
		System.out.print("Masukan Lebar balok: ");
		balok.lebar = scanner.nextDouble();
		
		System.out.print("Masukan Tinggi balok: ");
		balok.tinggi = scanner.nextDouble();
		
		System.out.println("Volume dari balok: " + balok.getvolume());
		
	}
}
