public class KamarHotel {
    private String nomorKamar;
    private String tipeKamar;
    private double hargaPerMalam;
    private int kapasitasMaksimal;
    private boolean isTersedia;

    public KamarHotel(String nomorKamar, String tipeKamar,  int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = 0.0; // Harga default, bisa diatur nanti
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.isTersedia = true; // Kamar baru selalu tersedia
        System.out.println("kamar" + nomorKamar + "berhasil di daftarin(Kilat)");
    }

    public KamarHotel(String nomorKamar, String tipeKamar, double hargaPerMalam, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.isTersedia = true; // Kamar baru selalu tersedia
        System.out.println("kamar" + nomorKamar + "berhasil di daftarin(Lengkap)");

    }

    // Bikin Getter dan Setter
    public String getNomorKamar() {
        return nomorKamar;
    }
    public String getTipeKamar() {
        return tipeKamar;
    }
    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }
    public double getHargaPerMalam() {
        return hargaPerMalam;
    }
    public boolean isTersedia() {
        return isTersedia;
    }

    //Setternya
    public void setTipeKamar(String tipeKamar) {
        if (tipeKamar.equalsIgnoreCase("Reguler") || tipeKamar.equalsIgnoreCase("Premium") || tipeKamar.equalsIgnoreCase("Suite")) {
            this.tipeKamar = tipeKamar;
            System.out.println("Tipe kamar sudah di ubah jadi: " + tipeKamar);
        } else {
            System.out.println("Tipe kamar tidak ada hanya ada:  Harus Reguler, Premium, atau Suite.");
        }
    }
    public void setHargaPerMalam(double hargaPerMalam) {
        if (hargaPerMalam < 50000) {
            System.out.println(" Batas Minimal dari Rp 50.000");
            this.hargaPerMalam = 50000; 
        } else {
            this .hargaPerMalam = hargaPerMalam;
            System.out.println("Harga per malam sudah di ubah jadi: " + hargaPerMalam);
        }
    }
    public void setKapasitasMaksimal(int kapasitasMaksimal){
        this.kapasitasMaksimal = kapasitasMaksimal;
    }

    // Method yang perlu di buat
    public void pesanKamar(){
        if (isTersedia){
            this.isTersedia = false;
            System.out.println("Kamar " + nomorKamar + " berhasil di Booking Asekk");
        } else {
            System.out.println("Kamar " + nomorKamar + " sudah di Booking, Coba Pilih kamar lain");
        }
    }
    public void pesanKamar(int jumlahtamu){
    if (!isTersedia){                         
        System.out.println("Kamar " + nomorKamar + " Sudah terisi");
    } else if (jumlahtamu > kapasitasMaksimal){
        System.out.println("Jumlah tamu " + jumlahtamu + " melebihi kapasitas maksimal " + kapasitasMaksimal + " Pesanan Gagal");
    } else {
        this.isTersedia = false;
        System.out.println("Kamar " + nomorKamar + " berhasil di Booking untuk " + jumlahtamu + " tamu");
    }
    }

    public void batalPesan(){
        this.isTersedia = true;
        System.out.println("Pesanana kamar "+ nomorKamar + "Sudah Dibatalkan" );
    }
    public double hitungTotalHarga(int jumlahMalam){
        double totalHarga = hargaPerMalam * jumlahMalam;
        System.out.println("Total bayarnya " + jumlahMalam + " malam adalah: Rp " + totalHarga);
        return totalHarga;
    }
    public double hitungTotalBayar(int jumlahMalam,String kodeVoucher){
        double totalHarga = hitungTotalHarga(jumlahMalam);
        if (kodeVoucher.equalsIgnoreCase("Promo" ) && jumlahMalam >= 3){
            double diskon = totalHarga * 0.20 ;
            double totalSetelahDikson = totalHarga - diskon;
            System.out.println("Voucher Promo sukses Diskon 20% Rp " + diskon );
            System.out.println("Total bayar " + jumlahMalam + " malam setelah ada diskonnya jadi Rp. " + totalSetelahDikson);
            return totalSetelahDikson;
        }
        else {
            if (!kodeVoucher.equalsIgnoreCase("Promo")){
                System.out.println("Kode voucher tidak valid, Total Normoal Rp. " + totalHarga);
            } else {
                System.out.println("Minimal 3 malam buat dapet voucher Promo, Total Normal Rp. " + totalHarga);
            }
            return totalHarga;
        }
    }
    public void tampilkanInfoKamar(){
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Tipe Kamar: " + tipeKamar);
        System.out.println("Harga Per Malam: Rp " + hargaPerMalam);
        System.out.println("Kapasitas Maksimal: " + kapasitasMaksimal + " orang");
        System.out.println("Status Ketersediaan: " + (isTersedia ? "Tersedia" : "Tidak Tersedia"));
    }
}