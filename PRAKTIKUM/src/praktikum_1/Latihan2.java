package praktikum_1;
	import java.util.Scanner;

	public class Latihan2 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        Tanah tanah = new Tanah();

	        System.out.println(" Program Menghitung Harga Total Tanah");
	        System.out.print("Masukkan luas tanah (m2): ");
	        
	        tanah.luas = input.nextInt();
	        System.out.println("Harga total tanah Sinta adalah: Rp. " + tanah.getHargaTotal());
	    }
	}

