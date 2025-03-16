static void whileMethod_0056(){
    //Program infinity loop dengan "while"

    int i_0056 = 0;

    Console.Write("Jalankan program angka 1 s/d 30 dengan while? Y/N : ");
    char confirm_0056 = Convert.ToChar(Console.Read());
    if (confirm_0056 == 'Y') {
        while (i_0056 <= 30) {
            Console.WriteLine("Cetak Angka ke " + i_0056 + " dengan while");
            i_0056++;
        }
    }
    else if (confirm_0056 == 'N') {
        Console.WriteLine("Canceled");
    }
    else {
        Console.WriteLine("Error");
    }

}

static void dowhileMethod_0056(){
    //Program infinity loop dengan "do while"

    int j_0056 = 0;

    Console.Write("Jalankan program 1 s/d 30 dengan do while? Y/N : ");
    char confirm_0056 = Convert.ToChar(Console.Read());

    if (confirm_0056 == 'Y') {
        do {
        Console.WriteLine("Cetak Angka ke " + j_0056 + " dengan do while");
        j_0056++;
        }
        while (j_0056 <= 30);
    } 
    else if (confirm_0056 == 'N'){
        Console.WriteLine("Canceled");
    }
    else {
        Console.WriteLine("Error");
    }

}

static void forMethod_0056(){
    //Program Infinity loop dengan "for"

    Console.Write("Jalankan program 1 s/d 30 dengan for? Y/N : ");
    char confirm_0056 = Convert.ToChar(Console.Read());

    if (confirm_0056 == 'Y') {
        for(int k_0056 = 0; k_0056 <= 30; k_0056++) {
            Console.WriteLine("Cetak Angka ke " + k_0056 + " dengan for");
        } 
    }
    else if (confirm_0056 == 'N') {
        Console.WriteLine("Canceled");
    }
    else {
        Console.WriteLine("Error");
    }
}

static void nimGanjilGenap(){
    //Program Ganjil Genap

    Console.Write("Masukan NIM : ");
    string? inputNim_0056 = Console.ReadLine();
    string nimGanjil_0056 = "";
    string nimGenap_0056 = "";
    if(inputNim_0056 != null) {

        foreach (char angka_0056 in inputNim_0056) {
            int nomor_0056 = (int)char.GetNumericValue(angka_0056);
            if (nomor_0056 % 2 == 0) {
                nimGenap_0056 += nomor_0056 + " "; 
            }

            else {
                nimGanjil_0056 += nomor_0056 + " ";
            }
            
        }
    }

    else {
        Console.WriteLine("Error: Input tidak boleh null");
    }

    Console.WriteLine("NIM Saya = " + inputNim_0056);
    Console.WriteLine("Angka genap NIM saya = " + nimGenap_0056);
    Console.WriteLine("Angka ganjil NIM Saya = " + nimGanjil_0056);

}

Console.WriteLine("//// Program Perulangan - Alogritma dan Pemrograman - Itsna Akhdan Fadhil - NIM 102022400056 ////");
Console.WriteLine("");
Console.WriteLine("1. Program Perulangan While 1 s/d 30");
Console.WriteLine("2. Program Perulangan do While 1 s/d 30");
Console.WriteLine("3. Program Perulangan For 1 s/d 30");
Console.WriteLine("4. Program Mengecek Ganjil Genap NIM");
Console.WriteLine("");
Console.Write("Siilahkan Masukan Input 1/2/3/4 : ");
int input_0056 = Convert.ToInt32(Console.ReadLine());

    if (input_0056 == 1) {
        whileMethod_0056();
    }

    else if (input_0056 == 2) {
        dowhileMethod_0056();
    }

    else if (input_0056 == 3) {
        forMethod_0056();
    }

    else if (input_0056 == 4) {
        nimGanjilGenap();
    }

    else {
        Console.WriteLine("Error");
    }



