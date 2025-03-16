string [] hero = {"Floryn", "Roger", "Lunox", "Julian", "Ling"};

Console.WriteLine("==========Sistem Statistik Hero Mobile Legends===========");
Console.WriteLine("");
Console.WriteLine("Masukan statistik untuk Floryn");
Console.Write("Attack : ");
int a = Convert.ToInt32(Console.ReadLine());
Console.Write("Defence : ");
int b = Convert.ToInt32(Console.ReadLine());
Console.Write("Magic : ");
int c = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("");
Console.WriteLine("Masukan statistik untuk Roger");
Console.Write("Attack : ");
int d = Convert.ToInt32(Console.ReadLine());
Console.Write("Defence : ");
int e = Convert.ToInt32(Console.ReadLine());
Console.Write("Magic : ");
int f = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("");
Console.WriteLine("Masukan statistik untuk Lunox");
Console.Write("Attack : ");
int g = Convert.ToInt32(Console.ReadLine());
Console.Write("Defence : ");
int h = Convert.ToInt32(Console.ReadLine());
Console.Write("Magic : ");
int i = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("");
Console.WriteLine("Masukan statistik untuk Julian");
Console.Write("Attack : ");
int j = Convert.ToInt32(Console.ReadLine());
Console.Write("Defence : ");
int k = Convert.ToInt32(Console.ReadLine());
Console.Write("Magic : ");
int l = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("");
Console.WriteLine("Masukan statistik untuk Ling");
Console.Write("Attack : ");
int m = Convert.ToInt32(Console.ReadLine());
Console.Write("Defence : ");
int n = Convert.ToInt32(Console.ReadLine());
Console.Write("Magic : ");
int o = Convert.ToInt32(Console.ReadLine());


int [,] statistikHero = 
{
    {a, b, c},
    {d, e, f},
    {g, h, i},
    {j, k, l},
    {m, n, o}
};

Console.WriteLine("");
Console.WriteLine("==========Hasil Analisis===========");
Console.WriteLine("");
Console.WriteLine("Daftar Hero dan StatistikS");
Console.WriteLine("");
Console.WriteLine($"Floryn: Attack={statistikHero[0,0]}, Defense={statistikHero[0,1]}, Magic={statistikHero[0,2]}");
Console.WriteLine($"Julian: Attack={statistikHero[1,0]}, Defense={statistikHero[1,1]}, Magic={statistikHero[1,2]}");
Console.WriteLine($"Ling: Attack={statistikHero[2,0]}, Defense={statistikHero[2,1]}, Magic={statistikHero[2,2]}");
Console.WriteLine($"Lunox: Attack={statistikHero[3,0]}, Defense={statistikHero[3,1]}, Magic={statistikHero[3,2]}");
Console.WriteLine($"Roger: Attack={statistikHero[4,0]}, Defense={statistikHero[4,1]}, Magic={statistikHero[4,2]}");
Console.WriteLine("");
Console.WriteLine("===================================");
Console.WriteLine("");