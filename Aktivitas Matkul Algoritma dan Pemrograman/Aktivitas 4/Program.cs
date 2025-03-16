static void whileMethod_0056(){
    //Program infinity loop dengan "while"

    int i_0056 = 0;

    Console.Write("Jalankan program infinity loop while? Y/N : ");
    char confirm_0056 = Convert.ToChar(Console.Read());
    if (confirm_0056 == 'Y') {
        while (confirm_0056 == 'Y') {
            Console.WriteLine(i_0056);
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

    int i_0056 = 0;

    Console.Write("Jalankan program infinity loop dengan do while? Y/N : ");
    char confirm_0056 = Convert.ToChar(Console.Read());

    if (confirm_0056 == 'Y') {
        do {
        Console.WriteLine(i_0056);
        i_0056++;
        }
        while (confirm_0056 == 'Y');
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

    Console.Write("Jalankan program infinity loop dengan for? Y/N : ");
    char confirm_0056 = Convert.ToChar(Console.Read());

    if (confirm_0056 == 'Y') {
        for(int i_0056 = 0; confirm_0056 == 'Y'; i_0056++) {
            Console.WriteLine(i_0056);
        } 
    }
    else if (confirm_0056 == 'N') {
        Console.WriteLine("Canceled");
    }
    else {
        Console.WriteLine("Error");
    }
}

Console.WriteLine("//// Program Perulangan - Alogritma dan Pemrograman - Itsna Akhdan Fadhil - NIM 102022400056 ////");
Console.WriteLine("");
Console.WriteLine("1. Programm Perulangan While");
Console.WriteLine("2. Programm Perulangan do While");
Console.WriteLine("3. Programm Perulangan For");
Console.WriteLine("");
Console.WriteLine("/// ---------------------------------------------------------------------------------------- ////");
Console.Write("Siilahkan Masukan Input 1/2/3 : ");
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

    else {
        Console.WriteLine("Error");
    }



