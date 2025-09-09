import java.util.ArrayList;
import java.util.HashMap;

public class FinanceTracker {
    private ArrayList<Transaksi> daftarTransaksi;

    public FinanceTracker() {
        daftarTransaksi = new ArrayList<>();
    }

    public void tambahTransaksi(Transaksi transaksi) {
        daftarTransaksi.add(transaksi);
    }

    public void tampilkanRiwayat() {
        if (daftarTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            System.out.println("Riwayat Transaksi:");
            for (Transaksi t : daftarTransaksi) {
                System.out.println(t);
            }
        }
    }

    public void tampilkanRingkasan() {
        double totalPemasukan = 0;
        double totalPengeluaran = 0;

        for (Transaksi t : daftarTransaksi) {
            if (t.getTipe().equalsIgnoreCase("pemasukan")) {
                totalPemasukan += t.getJumlah();
            } else if (t.getTipe().equalsIgnoreCase("pengeluaran")) {
                totalPengeluaran += t.getJumlah();
            }
        }

        double saldo = totalPemasukan - totalPengeluaran;

        System.out.println("=== Ringkasan Keuangan ===");
        System.out.println("Total Pemasukan  : Rp " + totalPemasukan);
        System.out.println("Total Pengeluaran: Rp " + totalPengeluaran);
        System.out.println("Saldo Saat Ini   : Rp " + saldo);
    }

    public void ringkasanKategori() {
        HashMap<String, Double> kategoriMap = new HashMap<>();

        for (Transaksi t : daftarTransaksi) {
            if (t.getTipe().equalsIgnoreCase("pengeluaran")) {
                kategoriMap.put(t.getKategori(),
                    kategoriMap.getOrDefault(t.getKategori(), 0.0) + t.getJumlah());
            }
        }

        System.out.println("=== Pengeluaran per Kategori ===");
        for (String kategori : kategoriMap.keySet()) {
            System.out.println(kategori + ": Rp " + kategoriMap.get(kategori));
        }
    }
}
