public class Main {
    public static void main(String[] args) {
        KamarHotel kamar1 = new KamarHotel("101", "Reguler", 2);
        KamarHotel kamar2 = new KamarHotel("202", "Premium", 150000, 3);

        kamar1.tampilkanInfoKamar();
        kamar2.tampilkanInfoKamar();
    }
}

class KamarHotel {
    private String nomorKamar;
    private String tipeKamar;
    private double hargaPerMalam;
    private int kapasitasMaksimal;
    private boolean isTersedia;

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = 0.0;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.isTersedia = true;
    }

    public KamarHotel(String nomorKamar, String tipeKamar, double hargaPerMalam, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.isTersedia = true;
    }

    public void tampilkanInfoKamar(){
        System.out.println("Nomor: " + nomorKamar);
        System.out.println("Tipe: " + tipeKamar);
    }
}