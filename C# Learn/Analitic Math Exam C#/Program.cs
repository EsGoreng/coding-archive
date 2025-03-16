static void inputNilai() {

    Console.WriteLine("Masukan nilai ujian Matematika untuk 3 kelas (2 siswa per kelas): ");
    Console.WriteLine("");
    int[,] nilai = new int[2,1];
    
    for(int i = 1; i <= 3; i++) 
    {
        Console.WriteLine($"Kelas {i}:");
        for (int j = 0; j < 2;j++) 
        {    
            Console.Write($"Masukan nilai siswa ke-{i} :");
            nilai [j,0] = Convert.ToInt32(Console.ReadLine());
        }
    }   
}

while (true){
Console.WriteLine("=== MENU ANALISIS NILAI UJIAN MATEMATIKA ===");
Console.WriteLine("1. Input Nilai");
Console.WriteLine("2. Tampilkan Nilai");
Console.WriteLine("3. Keluar");
Console.Write("Pilih Menu");
Console.WriteLine("");
int input = int.Parse(Console.ReadLine());
if(input == 1){
    inputNilai();
}
else if(input == 2){

}

else if(input == 3){
    break;
}
else {
    Console.WriteLine("Input Tidak Valid");
}


}



