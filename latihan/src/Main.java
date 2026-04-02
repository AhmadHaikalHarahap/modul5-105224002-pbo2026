public class Main {
    public static void main(String[] args) {

        // membuat objek karyawan
        Karyawan k1 = new Karyawan("K002", "Haikal");

        // set departemen
        k1.setDepartemen("IT");

        // tes keamanan (input gaji minus)
        k1.setGajiPokok(-500000); // harus ditolak

        // perbaiki dengan nilai benar
        k1.setGajiPokok(5000000);

        // tampilkan data
        k1.tampilkanDataKaryawan();
    }
}