using System.Security.Cryptography.X509Certificates;

Console.WriteLine("/// Program hasil panen ///");
Console.Write("Masukan bilangan bilangan1 : ");
int bilangan1 = Convert.ToInt32(Console.ReadLine());
Console.Write("Masukan bilangan bilangan2 : ");
int bilangan2 = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Menu operasi : ");
Console.WriteLine("1. Pertambahan (+)");
Console.WriteLine("2. Pengurangan (-)");
Console.WriteLine("3. Perkalian (*)");
Console.WriteLine("4. Pembagian (/)");
Console.Write("Operasi yang ingin digunakan : ");
char input = Convert.ToChar(Console.ReadLine());
Console.WriteLine("==============================");

if (input == '+') {
    int hasil = bilangan1 + bilangan2;    
    Console.WriteLine("Hasil : " + bilangan1  + " + " + bilangan2 + " = " + hasil);
}

else if (input == '-') {
    int hasil = bilangan1 - bilangan2;
    Console.WriteLine("Hasil : " + bilangan1  + " - " + bilangan2 + " = " + hasil);
}

else if (input == '*') {
    int hasil = bilangan1 * bilangan2;
    Console.WriteLine("Hasil : " + bilangan1  + " * " + bilangan2 + " = " + hasil);
}

else if (input == '/') {
    if (bilangan1 == 0) {
        Console.WriteLine("Error: tidak bisa membagi angka nol.");
    }
    else if (bilangan2 == 0) {
        Console.WriteLine("Error: tidak bisa membagi angka nol.");
    }
    else {
        int hasil = bilangan1 / bilangan2;
         Console.WriteLine("Hasil : " + bilangan1  + " / " + bilangan2 + " = " + hasil);
        }
    }

else {
    Console.WriteLine("Operasi tidak valid. Silahkan pilih +, -, *, atau /");
}
