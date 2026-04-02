public class Main {
    public static void main(String[] args) {

        // membuat objek barang
        Barang barang = new Barang("B001", "Laptop");

        // mengisi kategori
        barang.setKategori("Elektronik");

        // percobaan akses langsung (ERROR)
        // barang.stok = 50;
        // Penjelasan:
        // Tidak bisa dilakukan karena stok bersifat private
        // Ini adalah bukti enkapsulasi bekerja

        // tes merusak sistem
        barang.setHargaSatuan(-1000);   // harus ditolak
        barang.kurangiStok(10);         // stok masih 0 = tidak cukup

        // isi data dengan benar
        barang.setHargaSatuan(7000000);
        barang.tambahStok(20);
        barang.kurangiStok(5);

        // tampilkan hasil akhir
        barang.tampilkanDetailBarang();
    }
}