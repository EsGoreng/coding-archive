/*
Nama    : Itsna Akhdan Fadhil
NIM     : 102022400056
Kelas   : SI-48-08
*/

while(true) {

Console.WriteLine("1. Buku Matematika, Kode Barang 01");
Console.WriteLine("2. Buku IPA, Kode Barang 02");
Console.WriteLine("3. Buku IPS, Kode Barang 03");
Console.WriteLine("4. Buku Arab, Kode Barang 04");
Console.WriteLine("5. Buku Sosiologi, Kode Barang 05");
Console.WriteLine("6. Buku Sejarah, Kode Barang 06");
Console.WriteLine("7. Buku Alpro, Kode Barang 07");
Console.WriteLine("8. Buku Python, Kode Barang 08");
Console.WriteLine("");

Console.Write("Silahkan input resi pemesanan anda : ");

    double resi_0056 = 1319236337;
    double input_0056 = Convert.ToDouble(Console.ReadLine());
    int total_pesan_0056 = 1;


    if (input_0056 == resi_0056) {
        if (total_pesan_0056 >= 6) {
        Console.WriteLine("Selamat Anda Mendapatakan Voucher Belanja Senilai 50.000");
        break;
        }
        else if (total_pesan_0056 < 6) {
        Console.WriteLine("Selamat Pesanan Anda sedang di proses");
        Console.WriteLine("");
        break;
        }
    }

    else {
        continue;
    }

}

