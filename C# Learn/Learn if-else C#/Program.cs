/*
Nama    : Itsna Akhdan Fadhil
NIM     : 102022400056
Kelas   : SI-48-08
*/

    Console.WriteLine("TULT-1");
    Console.WriteLine("TULT-2");
    Console.WriteLine("TULT-3");
    Console.WriteLine("TULT-4");
    Console.WriteLine("TULT-5");
    Console.WriteLine("");

    while(true) {

    

    Console.Write("Kelas hari ini di ruang nomor berapa? ");
    int input_0056 = Convert.ToInt32(Console.ReadLine());

    if (input_0056 == 1) {
        Console.WriteLine("Silahkan menggunakan akses lift nomor 8");
        break;
    }
    else if (input_0056 == 2) {
        Console.WriteLine("Silahkan menggunakan akses lift nomor 8");
        break;
    }
    else if (input_0056 == 3) {
        Console.WriteLine("Silahkan menggunakan akses lift nomor 8");
        break;
    }
    else if (input_0056 == 4) {
        Console.WriteLine("Silahkan menggunakan akses lift nomor 8");
        break;
    }
    else if (input_0056 == 5) {
        Console.WriteLine("Silahkan menggunakan akses lift nomor 8");
        break;
    }
    else {
        Console.Write("Apakah anda yakin ruangan tersebut ada di gedung ini? ");
        string yatidak_0056 = Convert.ToString(Console.ReadLine());
        if (yatidak_0056 == "YA") {
            Console.WriteLine("Silahkan hubungi admin TULT");
            break;
        }
        else if (yatidak_0056 == "TIDAK") {
           continue;
        }
    }

    }

