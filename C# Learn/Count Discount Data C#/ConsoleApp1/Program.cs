using System.Configuration.Assemblies;

Console.WriteLine("SELAMAT DATANG DI INDIMIRIT");
Console.WriteLine("=====================================");
Console.Write("Masukan total belanja : Rp ");
int input = Convert.ToInt32(Console.ReadLine());
Console.Write("Apakah anda member? (ya/tidak) : ");
string? member = Console.ReadLine();
Console.WriteLine("=====================================");

int diskon = 0;
int hasil = 0;

if (member == "ya") {
    if (input >= 100000 && input <= 200000 ) {
        diskon = input * 15 / 100;
        hasil = input - diskon;
        Console.WriteLine("Anda hemat sebesar : " + diskon );
        Console.WriteLine("Total Harga setelah diskon : " + hasil);
    }

    else if (input >= 200000 && input < 300000) {
        diskon = input * 25 / 100;
        hasil = input - diskon;
        Console.WriteLine("Anda hemat sebesar : " + diskon );
        Console.WriteLine("Total Harga setelah diskon : " + hasil);
    }

    else if (input >= 300000) {
        diskon = input * 30 / 100;
        hasil = input - diskon;
        Console.WriteLine("Anda hemat sebesar : " + diskon );
        Console.WriteLine("Total Harga setelah diskon : " + hasil);
    }

}

else if (member == "tidak") {
    if (input >= 100000 && input < 200000 ) {
            diskon = input * 10 / 100;
            hasil = input - diskon;
            Console.WriteLine("Anda hemat sebesar : " + diskon );
            Console.WriteLine("Total Harga setelah diskon : " + hasil);
    }

    else if (input >= 200000 && input < 300000) {
            diskon = input * 20 / 100;
            hasil = input - diskon;
            Console.WriteLine("Anda hemat sebesar : " + diskon );
            Console.WriteLine("Total Harga setelah diskon : " + hasil);
    }

    else if (input >= 300000) {
        diskon = input * 25 / 100;
        hasil = input - diskon;
        Console.WriteLine("Anda hemat sebesar : " + diskon );
        Console.WriteLine("Total Harga setelah diskon : " + hasil);
    }
}