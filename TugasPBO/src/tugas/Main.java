package tugas;

class Driver {
    private String nama;

    public Driver(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void antarPesanan(PesananFood p) {
        System.out.println(nama + " mengantar pesanan " + p.getNamaMenu());
    }
}

class PesananFood {
    private String namaMenu;
    private int jumlah;
    private double totalHarga;
    private Driver driver;              

    public PesananFood(String namaMenu, int jumlah) {
        this.namaMenu = namaMenu;
        this.jumlah = jumlah;
    }

    public void hitungTotal(double hargaSatuan) {
        totalHarga = hargaSatuan * jumlah;
    }

    public double getTotalHarga() { return totalHarga; }
    public String getNamaMenu()   { return namaMenu; }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void kirim() {
        driver.antarPesanan(this);
    }
}


class MediaAudio {
    protected String judul;
    protected int durasi;              

    public MediaAudio(String judul, int durasi) {
        this.judul = judul;
        this.durasi = durasi;
    }

    public void putar() {
        System.out.println("Memutar audio: " + judul);
    }
}

class Lagu extends MediaAudio {
    private String artis;

    public Lagu(String judul, int durasi, String artis) {
        super(judul, durasi);
        this.artis = artis;
    }

    @Override
    public void putar() {
        System.out.println("Memutar lagu: " + judul + " - " + artis);
    }
}


public class Main {
    public static void main(String[] args) {
        // GoFood
        PesananFood p = new PesananFood("Nasi Goreng", 2);
        p.hitungTotal(20000);
        p.setDriver(new Driver("Budi"));
        p.kirim();
        System.out.println("Total: " + p.getTotalHarga());

        // Spotify
        MediaAudio m = new Lagu("Judul Lagu", 210, "Artis A");
        m.putar();
    }
}