using System;
using System.Collections.Generic;
using System.Reflection.Metadata;
using System.Linq;

public class ContohList
{   
    public static void Array()
    {
        string[] namaHewan_0056 = {"Kucing","Ayam","Unta","Beruang","Pinguin","Serigala","Katak","Musang","Burung","Harimau"};

        Console.WriteLine("Contoh Program Array :");
        Console.WriteLine("");
        Console.WriteLine("mendeklarasikan array dengan :");
        Console.WriteLine("");
        Console.WriteLine("String[] namaHewan_0056 = {'Kucing','Ayam','Unta','Beruang','Pinguin','Serigala','Katak','Musang','Burung','Harimau'};");
        Console.WriteLine("");
        Console.WriteLine("jika kita ingin menampilkan elemen-elemen tersebut dengan for, maka buatlah code sebagai berikut :");
        Console.WriteLine("");
        Console.WriteLine("for(int i = 0;i < namaHewan_0056.Length; i++)");
        Console.WriteLine("{");
        Console.WriteLine("    Console.WriteLine(namaHewan_0056[i]);");
        Console.WriteLine("}");
        Console.WriteLine("");
        Console.WriteLine("Maka akan menghasilkan output seperti dibawah :");
        Console.WriteLine("");
        for(int i = 0;i < namaHewan_0056.Length; i++)
        {
            Console.WriteLine(namaHewan_0056[i]);
        }
        Console.WriteLine("");
        Console.WriteLine("Berikut adalah kode mencari string gajah di array namaHewan_0056");
        Console.WriteLine("");
        Console.WriteLine("if (namaHewan_0056.Contains(Cari))");
        Console.WriteLine("{");
        Console.WriteLine("    Console.WriteLine($'Hewan {namaHewan_0056} ditemukan.);");
        Console.WriteLine("}");
        Console.WriteLine("else");
        Console.WriteLine("{");
        Console.WriteLine("    Console.WriteLine($'Hewan {namaHewan_0056} tidak ditemukan.')");
        Console.WriteLine("}");
        Console.WriteLine("");
        Console.WriteLine("jika dijalankan program akan menapilkan sebagai berikut ");
        string cari = "Unta";
        if (namaHewan_0056.Contains(cari))
        {
            Console.WriteLine($"Hewan {namaHewan_0056} ditemukan.");
        }
        else
        {
            Console.WriteLine($"Hewan {namaHewan_0056} tidak ditemukan.");
        }
        Console.WriteLine("selain itu ada bentuk array seperti berikut");
        Console.WriteLine("");
        Console.WriteLine("int[,] numbers = { {1, 4, 2}, {3, 6, 8} };");
        Console.WriteLine("");
        Console.WriteLine("array tersebut merupakan array 2D karena didalam kurung ke-1 yang mana array mengandung anak kurung yang berisi  array lagi");
        Console.WriteLine("");
        Console.WriteLine("int[,] numbers = { { {1, 4, 2}, {3, 6, 8} }, { {1, 4, 2}, {3, 6, 8} } };");
        Console.WriteLine("");
        Console.WriteLine("array tersebut merupakan array 3D karena didalam kurung ke-1 yang mana array mengandung anak kurung yang berisi array ke-2 dan ke-3 ");
    }
    public static void List()
    {
        // Deklarasi list
        List<int> angka_0056 = new List<int> { 10, 20, 30, 40, 50 };

        // Menghapus angka_0056 pertama
        angka_0056.RemoveAt(0);

        // Menambahkan angka_0056 baru ke dalam List
        angka_0056.Add(60);

        // Menampilkan semua elemen dalam List menggunakan foreach
        Console.WriteLine("Isi List setelah operasi:");
        foreach (int item in angka_0056)
        {
            Console.WriteLine(item);
        }

        List<string> mahasiswa_0056 = new List<string> { "Adi", "Bara", "Citra", "Dewi" };

        // Mengecek apakah nama "Bara" ada dalam List
        string cariNama = "Bara";
        if (mahasiswa_0056.Contains(cariNama))
        {
            Console.WriteLine($"{cariNama} adalah mahasiswa_0056 yang terdaftar.");
        }
        else
        {
            Console.WriteLine($"{cariNama} tidak terdaftar.");
        }
    }
    public static void Main(string[] args)
    {
        while(true) 
        {
            Console.WriteLine("Program Aktivitas 9 - Alogritma dan Pemrograman");
            Console.WriteLine("");
            Console.WriteLine("1. Latihan Array");
            Console.WriteLine("2. Latihan List");
            Console.WriteLine("");
            Console.Write("Silahkan pilih menu : ");
            int pilihan_0056 = int.Parse(Console.ReadLine());
            if (pilihan_0056 == 1)
            {
                Array();
            }
            else if (pilihan_0056 ==2) 
            {
                List();
            }
            else
            {
                Console.WriteLine("Input Tidak Valid");
            }
        }
        
        
    }
}