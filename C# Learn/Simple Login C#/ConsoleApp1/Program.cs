string username = "admin";
string password = "admin";

while(true) {

Console.Write("Masukan username :");
string input_username = Console.ReadLine();
Console.Write("Masukan Password :");
string input_password = Console.ReadLine();

if (input_username == username && input_password == password) {
    Console.WriteLine("Login Berhasil !!");
    break;
}
else {
    Console.WriteLine("Login Gagal !!:");
    continue;
}

}


