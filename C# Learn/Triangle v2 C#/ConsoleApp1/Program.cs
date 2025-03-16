/*
Nama : Itsna Akhdan Fadhil
NIM : 102022400056
Kelas : SI-48-08
*/
Console.WriteLine("Selamat Datang di TP Moddul-3 Program Segitiga !!");
Console.WriteLine("");
while (true) {
    Console.Write("Silahkan Input Tinggi Segitiga yang Diinginkan: ");
    int angka;
    String n = Console.ReadLine();
    if (int.TryParse(n, out angka)) {
        if (angka > 0) {
            for(int i = 0; i <= angka; i++) {
                for(int j = 0; j < i; j++) {
                    Console.Write("*");
                }
                Console.WriteLine("");
            }
    }
    else {
            Console.WriteLine("Silahkan Masukan Bilangan Bulat !!");
    }
    }
    else {
        Console.WriteLine("Silahkan Masukan Bilangan Bulat !!");
    }
    break;
}
