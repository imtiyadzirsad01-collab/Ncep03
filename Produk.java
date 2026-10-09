public class Produk {
    private String kodeProduk;
    private String nama;
    private int stok;

    // Constructor
    public Produk(String kodeProduk, String nama, int stok) {
        this.kodeProduk = kodeProduk;
        this.nama = nama;
        this.stok = stok;
    }

    // Getter methods
    public String getKodeProduk() { return kodeProduk; }
    public String getNama() { return nama; }
    public int getStok() { return stok; }

    // Setter methods
    public void setKodeProduk(String kodeProduk) { this.kodeProduk = kodeProduk; }
    public void setNama(String nama) { this.nama = nama; }
    public void setStok(int stok) { this.stok = stok; }

    // Tampilkan info singkat
    public void tampilkanInfo() {
        System.out.println("Kode: " + kodeProduk + " | Nama: " + nama + " | Stok: " + stok);
    }
}