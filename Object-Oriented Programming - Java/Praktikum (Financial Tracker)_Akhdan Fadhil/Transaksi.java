public class Transaksi {
    private double jumlah;
    private String kategori;
    private String tipe;
    private String tanggal;

    public Transaksi(double jumlah, String kategori, String tipe, String tanggal) {
        this.jumlah = jumlah;
        this.kategori = kategori;
        this.tipe = tipe;
        this.tanggal = tanggal;
    }

    public double getJumlah() {
        return jumlah;
    }

    public String getKategori() {
        return kategori;
    }

    public String getTipe() {
        return tipe;
    }

    public String getTanggal() {
        return tanggal;
    }

    @Override
    public String toString() {
        return tipe + " | " + jumlah + " | " + kategori + " | " + tanggal;
    }
}
