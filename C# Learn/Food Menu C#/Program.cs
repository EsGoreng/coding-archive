namespace ClassLibrary1
{
    public class Class1
    {
        private static int pilihan;

        public static void displaytotal(){
            double nasgor = 15000;
            double ayam_pecel = 18000;
            double soto_ayam = 14000;
            double es_teh = 5000;
            double es_jeruk = 8000;
            double teh_pucuk = 4000;
            double = Class1.pilihan;
            
        }
        public static void startorder()
        {
            Console.WriteLine("Selamat datang di program menu makan praktikum");
            Console.WriteLine("");
            Console.WriteLine("1. Makanan");
            Console.WriteLine("2. Minuman");
            Console.WriteLine("3. Selesai");
            Console.Write("Masukan Pilihan Anda (1-3): ");
            int input = Convert.ToInt32(Console.ReadLine());
             if (input == 1) {
                ordermakanan();
            }
            else if (input == 2) {
                orderminuman();
            }
            else if (input == 3) {
                Console.WriteLine("Terima Kasih :D !!");
            }
            else {
                Console.WriteLine("Input Tidak Valid");
            }
        }
        private static void ordermakanan() 
        {
            Console.WriteLine("Pilihan Minuman:");
            Console.WriteLine("1. Nasi Goreng   Rp 15.000");
            Console.WriteLine("2. Ayam Pecel   Rp 18.000");
            Console.WriteLine("3. Soto Ayam   Rp 14.000");
            Console.WriteLine("4. Kembali");
            Console.Write("Masukan pilihan anda (1-4): ");
            int input = Convert.ToInt32(Console.ReadLine());
            if (input == 1){
                Console.WriteLine("Terimakasih Telah Memesan");
                Console.WriteLine("Total Pemesanan Anda adalah Rp 15000");
            }
            else if (input == 2){
                Console.WriteLine("Terimakasih Telah Memesan");
                Console.WriteLine("Total Pemesanan Anda adalah Rp 18000");
            }
            else if (input == 3){
                Console.WriteLine("Terimakasih Telah Memesan");
                Console.WriteLine("Total Pemesanan Anda adalah Rp 14000");
            }
            else if (input == 4){
                startorder();
            }
            else {
                Console.WriteLine("Input Tidak Valid");
            }
        }
        private static int orderminuman()
        {
            Console.WriteLine("Pilihan Makanan:");
            Console.WriteLine("1. Es Teh   Rp 5.000");
            Console.WriteLine("2. Es Jeruk   Rp 8.000");
            Console.WriteLine("3. Teh Pucuk   Rp 4.000");
            Console.WriteLine("4. Kembali");
            Console.Write("Masukan pilihan anda (1-4): ");
            int input = Convert.ToInt32(Console.ReadLine());
            if (input == 1){
                Console.WriteLine("Terimakasih Telah Memesan");
                int Minuman = 15000;
                Console.WriteLine("Total Pemesanan Anda adalah Rp 15000");
            }
            else if (input == 2){
                Console.WriteLine("Terimakasih Telah Memesan");
                int Minuman = 18000;
                Console.WriteLine("Total Pemesanan Anda adalah Rp 18000");
            }
            else if (input == 3){
                Console.WriteLine("Terimakasih Telah Memesan");
                int Minuman = 14000;
                Console.WriteLine("Total Pemesanan Anda adalah Rp 14000");
            }
            else if (input == 4){
                startorder();
            }
            else {
                Console.WriteLine("Input Tidak Valid");
            }
            return pilihan;
        }

        private static void Main(String[]args) {
            
        }
    }
}
