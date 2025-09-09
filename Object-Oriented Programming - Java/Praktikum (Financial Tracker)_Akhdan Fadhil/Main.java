import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FinanceTracker tracker = new FinanceTracker();

        int pilihan;
        do {
            System.out.println("\nSelamat Datang di Personal Finance Tracker! - 102022400056 - Itsna Akhdan Fadhil");
            System.out.println("Pilih menu:");
            System.out.println("1. Tambah Transaksi");
            System.out.println("2. Lihat Ringkasan");
            System.out.println("3. Lihat Riwayat Transaksi");
            System.out.println("4. Ringkasan Pengeluaran per Kategori");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan tipe (pemasukan/pengeluaran): ");
                    String tipe = input.nextLine();
                    System.out.print("Masukkan jumlah: ");
                    double jumlah = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan kategori: ");
                    String kategori = input.nextLine();
                    System.out.print("Masukkan tanggal (dd-mm-yyyy): ");
                    String tanggal = input.nextLine();

                    Transaksi transaksi = new Transaksi(jumlah, kategori, tipe, tanggal);
                    tracker.tambahTransaksi(transaksi);
                    System.out.println("Transaksi berhasil ditambahkan!");
                    break;

                case 2:
                    tracker.tampilkanRingkasan();
                    break;

                case 3:
                    tracker.tampilkanRiwayat();
                    break;

                case 4:
                    tracker.ringkasanKategori();
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan Personal Finance Tracker!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        input.close();
    }
}
