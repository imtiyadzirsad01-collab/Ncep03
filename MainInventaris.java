import java.util.HashMap;

public class MainInventaris {
    public static void main(String[] args) {
        // 1. HashMap sebagai storage utama
        HashMap<String, Produk> mapInventaris = new HashMap<>();

        // 2. Tambahkan minimal 5 produk ke dalam HashMap
        mapInventaris.put("P001", new Produk("P001", "Laptop ASUS", 15));
        mapInventaris.put("P002", new Produk("P002", "Mouse Logitech", 40));
        mapInventaris.put("P003", new Produk("P003", "Keyboard Mechanical", 25));
        mapInventaris.put("P004", new Produk("P004", "Monitor LG 24 inch", 10));
        mapInventaris.put("P005", new Produk("P005", "Headset Gaming", 30));

        // 3. Cetak awal inventaris
        System.out.println("= Daftar Inventaris Awal =");
        for (String key : mapInventaris.keySet()) {
            mapInventaris.get(key).tampilkanInfo();
        }
        System.out.println("Total Produk: " + mapInventaris.size());
        System.out.println("--------------------------------------------------");

        // 4. Simulasi ubah stok via
        String targetUbah = "P002";
        if (mapInventaris.containsKey(targetUbah)) {
            mapInventaris.get(targetUbah).setStok(55);
            System.out.println(">> Stok produk " + targetUbah + " berhasil diubah.");
        }

        // 5. Simulasi hapus satu produk via
        String targetHapus = "P004";
        mapInventaris.remove(targetHapus);
        System.out.println(">> Produk dengan kode " + targetHapus + " telah dihapus.");
        System.out.println("--------------------------------------------------");

        // 6. Cetak akhir setelah perubahan
        System.out.println("= Daftar Inventaris Akhir =");
        for (String key : mapInventaris.keySet()) {
            mapInventaris.get(key).tampilkanInfo();
        }
        System.out.println("Total Produk: " + mapInventaris.size());
    }
}