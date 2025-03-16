/*
Nama  : Itsna Akhdan Fadhil
NIM   : 102022400056
Kelas : SI-48-08
*/

Console.WriteLine("///// Program Input Nilai /////");
Console.WriteLine("");
Console.Write("Masukan Input : ");
int input_0056 = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("");

if (input >= 60){
    Console.WriteLine("Lulus");
}
else {
    Console.WriteLine("Tidak Lulus");
}

if (input >= 90) {
    Console.WriteLine("Grade : A");
}
else if (input >= 80) {
    Console.WriteLine("Grade : AB");
}
else if (input >= 70) {
    Console.WriteLine("Grade : B");
}
else if (input >= 60) {
    Console.WriteLine("Grade : C");
}
else {
    Console.WriteLine("Grade : D");
}
Console.WriteLine("");
Console.WriteLine("///////////////////////////////");
