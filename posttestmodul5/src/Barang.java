public class Barang {
   // atribut private
    private String idBarang;
    private String namaBarang;
    private int stok;
    private double hargaSatuan;

    // atribut protected
    protected String kategori;

    // konstruktor
    public Barang(String idBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0;
        this.hargaSatuan = 0;
    }

    // getter & setter idBarang
    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    // getter & setter namaBarang
    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    // getter stok
    public int getStok() {
        return stok;
    }

    // setter stok
    public void setStok(int stok) {
        if (stok < 0) {
            System.out.println("Stok tidak boleh negatif!");
        } else {
            this.stok = stok;
        }
    }

    // getter harga
    public double getHargaSatuan() {
        return hargaSatuan;
    }

    // setter harga
    public void setHargaSatuan(double hargaSatuan) {
        if (hargaSatuan <= 0) {
            System.out.println("Harga harus lebih dari 0!");
        } else {
            this.hargaSatuan = hargaSatuan;
        }
    }

    // setter & getter kategori
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // tambah stok
    public void tambahStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah harus lebih dari 0!");
        } else {
            stok += jumlah;
        }
    }

    // kurangi stok
    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah harus lebih dari 0!");
        } else if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi!");
        } else {
            stok -= jumlah;
        }
    }

    // tampilkan detail
    public void tampilkanDetailBarang() {
        System.out.println("=== Detail Barang ===");
        System.out.println("ID        : " + idBarang);
        System.out.println("Nama      : " + namaBarang);
        System.out.println("Kategori  : " + kategori);
        System.out.println("Stok      : " + stok);
        System.out.println("Harga     : " + hargaSatuan);
    }
}