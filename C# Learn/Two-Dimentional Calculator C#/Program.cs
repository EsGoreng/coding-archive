
static void LuasLingkaran(){
Console.WriteLine("Catatan: Satuan yang digunakan adalah CM!!");
Console.WriteLine("");
Console.Write("Masukan jari-jari lingkaran : ");
double jari = Convert.ToDouble(Console.ReadLine());
double luasLingkaran = Math.PI * jari * jari;
Console.WriteLine($"Luas lingkaran adalah : {luasLingkaran:F2} cm^2" );

}

static void KelilingLingkaran(){
Console.WriteLine("Catatan: Satuan yang digunakan adalah CM!!");
Console.WriteLine("");
Console.Write("Masukan jari-jari lingkaran : ");
double jari = Convert.ToDouble(Console.ReadLine());
double kelilingLingkaran = 2 * Math.PI * jari;
Console.WriteLine($"Keliling lingkaran adalah : {kelilingLingkaran:F2} cm");

}

static void LuasPersegi(){
Console.WriteLine("Catatan: Satuan yang digunakan adalah CM!!");
Console.WriteLine("");
Console.Write("Masukan sisi persegi : ");
double sisi = Convert.ToDouble(Console.ReadLine());
double luasPersegi = sisi * sisi;
Console.WriteLine($"Luas persegi adalah : {luasPersegi:F2} cm^2");
}

static void KelilingPersegi(){
Console.WriteLine("Catatan: Satuan yang digunakan adalah CM!!");
Console.WriteLine("");
Console.Write("Masukan sisi persegi : ");
double sisi = Convert.ToDouble(Console.ReadLine());
double kelilingPersegi = 4 * sisi;
Console.WriteLine($"keliling persegi adalah : {kelilingPersegi:F2} cm^2");
}

static void LuasSegitiga(){
Console.WriteLine("Catatan: Satuan yang digunakan adalah CM!!");
Console.WriteLine("");
Console.Write("Masukan alas segitiga : ");
double alas = Convert.ToDouble(Console.ReadLine());
Console.Write("Masukan tinggi segitiga : ");
double tinggi = Convert.ToDouble(Console.ReadLine());
double luasSegitiga = 0.5f * alas * tinggi;
Console.WriteLine($"Luas Segitiga adalah : {luasSegitiga:F2} cm^2");
}

static void KelilingSegitiga(){
Console.WriteLine("Catatan: Satuan yang digunakan adalah CM!!");
Console.WriteLine("");
Console.Write("Masukan sisi a segitiga : ");
double sisia = Convert.ToDouble(Console.ReadLine());
Console.Write("Masukan sisi b segitiga : ");
double sisib = Convert.ToDouble(Console.ReadLine());
Console.Write("Masukan alas segitiga : ");
double alas = Convert.ToDouble(Console.ReadLine());

double kelilingSegitiga = sisia + alas + sisib;

Console.WriteLine($"Keliling Segitiga adalah : {kelilingSegitiga:F2} cm");
}


Console.WriteLine("//// Program kalkulator bangun datar - Praktikum Alogritma dan Pemrograman - Itsna Akhdan Fadhil - NIM 102022400056 ////");
Console.WriteLine("");
Console.WriteLine("Pilih bangun datar:");
Console.WriteLine("1. Program Lingkaran");
Console.WriteLine("2. Program Persegi");
Console.WriteLine("3. Program Segitiga");
Console.WriteLine("");
Console.Write("Siilahkan Masukan Input 1/2/3/4 : ");

double input_1 = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("/// Satuan yang digunakan adalah CM!! ///");
Console.WriteLine("Pilih Perhitungan : ");
Console.WriteLine("");  
Console.WriteLine("1. Luas");
Console.WriteLine("2. Keliling");
Console.WriteLine("");
Console.Write("Silahkan Masukan Input 1/2 : ");
double input_2 = Convert.ToDouble(Console.ReadLine());
Console.WriteLine("");
Console.WriteLine("/////////////////////////////////////////");

switch (input_1) {
    case 1:
        if (input_2 == 1) {
            LuasLingkaran();
        }
        else if (input_2 == 2) {
            KelilingLingkaran();
        }
        else {
            Console.WriteLine("Error");
        }
    break;

    case 2:
        if (input_2 == 1) {
            LuasPersegi();
        }
        else if (input_2 == 2) {
            KelilingPersegi();
        }
        else {
            Console.WriteLine("Error");
        }
    break;
    case 3:
        if (input_2 == 1) {
            LuasSegitiga();
        }
        else if (input_2 == 2) {
            KelilingSegitiga();
        }
        else {
            Console.WriteLine("Error");
        }
    break;

}

