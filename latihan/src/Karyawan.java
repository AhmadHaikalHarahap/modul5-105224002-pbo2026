public class Karyawan {
    // soal 1: atribut private
    private String idKaryawan;
    private String nama;

    // soal 2: atribut gaji
    private double gajiPokok;

    // soal 3: atribut protected
    protected String departemen;

    // konstruktor
    public Karyawan(String idKaryawan, String nama) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.gajiPokok = 0; // default
    }

    // idKaryawan
    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    // nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // gajiPokok
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok < 0) {
            System.out.println("Gaji tidak boleh minus!");
        } else {
            this.gajiPokok = gajiPokok;
        }
    }

    // departemen
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    // menampilkan data
    public void tampilkanDataKaryawan() {
        System.out.println("=== Data Karyawan ===");
        System.out.println("ID        : " + idKaryawan);
        System.out.println("Nama      : " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji      : " + gajiPokok);
    }
}