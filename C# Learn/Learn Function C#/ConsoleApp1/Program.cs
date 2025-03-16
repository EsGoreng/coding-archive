using System.Xml;

void opening() { //ini menggunakan void karena tidak mengembalikan nilai
    Console.WriteLine("Selamat Datang di Program Belajar Fungsi !!");
    Console.WriteLine("Pilih Menu :");
    Console.WriteLine("1.Void Function");
    Console.WriteLine("2.Function with Return Value");
    Console.WriteLine("3.Revursive Function");
    Console.WriteLine("");
    Console.Write("Masukan Pilihan : ");
    int pilihan = Convert.ToInt32(Console.ReadLine());
    if (pilihan == 1) {
        hello_world();
    }
    else if (pilihan == 2) {
        contoh_pertambahan();
    }
    else if (pilihan == 3) {
        contoh_perulangan();
    }
    else {
        Console.WriteLine("Input Tidak Valid !!, Silahkan Coba Lagi");
        opening();
    }

}

int pertambahan(int a, int b){
    int hasil = a + b; //menjumlahkan input int a dan b
    Console.WriteLine(hasil);
    return hasil; //mengembalikan ke variavle hasil
}

int perulangan(int x){
    while(x >= 0){
        x--; 
        Console.WriteLine(x);
    }
    return perulangan(Convert.ToInt32(Console.ReadLine())); //terjadi looping dan mengembalikan ke nilai ke fungsi perulangan berulang 
}

void hello_world(){
    Console.WriteLine("/////////////////////////////////////////////////////////////////////////////");
    Console.WriteLine("");
    Console.WriteLine("'Void Function' Berfungsi untuk fungsi yang tidak mengembalikan nilai !!!");
    Console.WriteLine();
    Console.WriteLine("Contoh :");
    Console.WriteLine("void hello_world() {");
    Console.WriteLine("Console.WriteLine('Hello World')");
    Console.WriteLine("}");
    Console.WriteLine("/////////////////////////////////////////////////////////////////////////////");
}

void contoh_pertambahan(){
    Console.WriteLine("/////////////////////////////////////////////////////////////////////////////");
    Console.WriteLine("");
    Console.WriteLine("Saya menggunakan program pertambahan sebagai contoh Function with Return Value");
    Console.WriteLine("Berikut adalah contoh programnya:");
    Console.WriteLine("int pertambahan(int a, int b){");
    Console.WriteLine("     int hasil = a + b;");
    Console.WriteLine("     Console.WriteLine(hasil);");
    Console.WriteLine("     return hasil;");
    Console.WriteLine("}");
    Console.Write("Siilahkan Masukan 2 Angka :");
    pertambahan(Convert.ToInt32(Console.ReadLine()), Convert.ToInt32(Console.ReadLine()));
    Console.WriteLine("/////////////////////////////////////////////////////////////////////////////");

}

void contoh_perulangan(){
    Console.WriteLine("/////////////////////////////////////////////////////////////////////////////");
    Console.WriteLine("");
    Console.WriteLine("Saya menggunakan program pertambahan sebagai contoh Recursive Function");
    Console.WriteLine("Berikut adalah contoh programnya:");
    Console.WriteLine("int perulangan(int x){");
    Console.WriteLine("     while(x >= 0){");
    Console.WriteLine("         x--;");
    Console.WriteLine("         Console.WriteLine(x);;");
    Console.WriteLine("     }");
    Console.WriteLine("     return perulangan(Convert.ToInt32(Console.ReadLine())); ");
    Console.WriteLine("}");
    Console.Write("Silahkan Masukan 1 Angka");
    perulangan(Convert.ToInt32(Console.ReadLine()));
    Console.WriteLine("/////////////////////////////////////////////////////////////////////////////");

}

opening();

