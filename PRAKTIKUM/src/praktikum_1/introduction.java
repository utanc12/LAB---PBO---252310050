package praktikum_1;

public class introduction {
	public static void main(String[] args) {
		System.out.println("Hello World");
	
		// variabel
		int angka1 = 10;
		int angka2 = 20;
		
		// tipe data
		String nama = "Putrabvf";
		
		// operator
		int hasilTambah = angka1 + angka2; // pertambahan
		hasilTambah++; // increment
		
		// operator perbandingan
		boolean pembanding = angka1 > angka2;
		boolean tesNama = nama == "Putra";
	
		// operator kondisional 
		boolean kondisional = (true || false) && (true && true);
		
		// operator assigment
		angka1 *= angka2; // angka1 dikali dgn angka2
							// hasilnya disimpan di angka1
		
		dog mydog = new dog();
		mydog.hungry();
		String name = "Toni";
		mydog.puppyName(name);
		
	}
}