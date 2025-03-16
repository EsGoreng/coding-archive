/*
    Nama : Itsna Akhdan Fadhil
    NIM : 102022400056
    TP 5 - Praktikum Algoritma dan Pemrograman
*/
using System;
using System.Linq;
using System.Reflection.Metadata.Ecma335;
using System.Threading.Tasks.Dataflow;
class Program
{
    static string[] namaMahasiswa = { "Pal", "Bob", "Alice", "Charlie", "Andi" };
    static int[] nilaiMahasiswa = { 100, 90, 85, 78, 65 };

    public static void TampilkanDataMahasiswa() {
        Console.WriteLine("==== Data Mahasiswa ====");
        Console.WriteLine("");
        for(int i = 0; i < namaMahasiswa.Length;i++ ) 
        {
            Console.WriteLine($"Nama : {namaMahasiswa[i]}, Nilai : {nilaiMahasiswa[i]}");
        }   
    }
    public static void TampilkanNilai() {
        int nilaiTertinggi = nilaiMahasiswa.Max();
        int nilaiTerendah = nilaiMahasiswa.Min();
        Console.WriteLine("==== Data Nilai Tertinggi dan Terendah ====");
        Console.WriteLine("");
        Console.WriteLine($"Nilai Mahasiswa Tertinggi : {nilaiTertinggi}");
        Console.WriteLine($"Nilai Mahasiswa Tertinggi : {nilaiTerendah}");
    }
    public static void rataRata() {
        double rataRata = nilaiMahasiswa.Average();
        Console.WriteLine("==== Data Rata - Rata Nilai Mahasiswa ====");
        Console.WriteLine("");
        Console.WriteLine($"Nilai Rata - Rata : {rataRata:F2}");
        Console.WriteLine("");
    }
    public static void UrutkanNilai() {
        Console.WriteLine("==== Data Mahasiswa berdasarkan nilai (Descending) ====");
        Console.WriteLine("");
        var dataMahasiswa = namaMahasiswa
        .Zip(nilaiMahasiswa, (nama, nilai) => new { Nama = nama, Nilai = nilai })
        .OrderByDescending(data => data.Nilai);
        foreach (var data in dataMahasiswa)
        {
            Console.WriteLine($"Nama : {data.Nama}, Nilai : {data.Nilai}");
        }
    }
    public static void Menu() 
    {
        while (true) {
        Console.WriteLine("");
        Console.WriteLine("=== PROGRAM DATA MAHASISWA === ");
        Console.WriteLine("");
        Console.WriteLine("1. Tampilkan semua data mahasiswa");
        Console.WriteLine("2. Tampilkan nilai tertinggi dan terendah");
        Console.WriteLine("3. Hitung rata-rata nilai");
        Console.WriteLine("4. Tampilkan data mahasiswa berdasarkan nilai (descending)");
        Console.WriteLine("5. Keluar");
        Console.WriteLine("");
        Console.Write("Masukan Pilihan : ");
        int pilihan = int.Parse(Console.ReadLine());
        Console.WriteLine("");

        if(pilihan == 1) {
            TampilkanDataMahasiswa();
        }
        else if (pilihan == 2) {
            TampilkanNilai();
        }
        else if (pilihan == 3) {
            rataRata();
        }
        else if (pilihan == 4) {
            UrutkanNilai();
        }
        else if (pilihan == 5) {
            Console.WriteLine("Program Selesai");
            break;
        }
        else {
            Console.WriteLine("Input Tidak Valid");
        }
        }   
        
    } 
    static void Main(string[] args) 
    {
        Menu();
    }
}
    

