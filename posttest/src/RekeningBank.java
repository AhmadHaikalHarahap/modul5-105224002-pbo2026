public class RekeningBank {
    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;

        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
            System.out.println("Saldo awal tidak boleh negatif. Saldo diset ke 0.");
        }
    }

    // jalur resmi untuk membaca nomor rekening
    public String getNomorRekening() {
        return nomorRekening;
    }

    // jalur resmi untuk membaca saldo
    public double getSaldo() {
        return saldo;
    }

    // jalur resmi untuk mengisi saldo
    public void isiSaldo(double jumlah) {
        if (jumlah >= 0) {
            saldo = saldo + jumlah;
            System.out.println("Isi saldo berhasil. Saldo sekarang: " + saldo);
        } else {
            System.out.println("Gagal isi saldo. Jumlah tidak boleh negatif.");
        }
    }

    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank("1234567890", 500000);

        System.out.println("Nomor Rekening: " + rekening1.getNomorRekening());
        System.out.println("Saldo Awal: " + rekening1.getSaldo());

        rekening1.isiSaldo(250000);  // valid
        rekening1.isiSaldo(-100000); // tidak valid

        System.out.println("Saldo Akhir: " + rekening1.getSaldo());
    }
}
