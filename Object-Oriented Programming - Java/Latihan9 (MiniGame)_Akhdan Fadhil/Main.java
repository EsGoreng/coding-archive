import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in); // mendefinisikan scanner untuk input pengguna
        
        System.out.println("|===================|TUGAS INDIVIDU PBO|===================|");
        System.out.println("|   Selamat datang di mini game petualangan saya, sebagai  |");
        System.out.println("|        tugas pendahuluan individu praktikum PBO !!       |");
        System.out.println("|=======|Created by Itsna Akhdan Fadhil 102022400056|======|");
        System.out.println("| Menu :                                                   |");
        System.out.println("| 1. Mulai game                                            |");
        System.out.println("| 2. Keluar                                                |");
        System.out.println("|==========================================================|");
        
        while (true) { //menggunakan loop untuk terus meminta input dari pengguna agar tidak keluar dari program
            System.out.print("\nMasukan Input : ");
            int input = myScanner.nextInt(); // meminta input dari pengguna untuk memilih menu
            System.out.print("Masukan Nama Player : ");
            String nama = myScanner.nextLine();
            nama = myScanner.nextLine(); // meminta input nama untuk karakter player
            Character player = new Character(nama, 150, null); // menginialisasi karakter player dengan nama dan health 50
            if(input == 1){

                int health = player.getHealth(); //menginisialisasi health player
                Scene outro = null; // mendeklarasikan variabel outro untuk menyimpan scene akhir
                if(health >= 100){ // menggunakan if else untuk menentukan scene akhir berdasarkan health player
                    outro = new Scene(
                        "Setelah melalui berbagai tantangan, pemilu akhirnya diumumkan. Anda berhasil meraih kemenangan dengan selisih suara yang cukup signifikan. Transparansi yang Anda dorong membuat rakyat semakin percaya pada kepemimpinan Anda.\r\n" +
                        "\r\n" +
                        "Fraud Demon akhirnya melemah dan menghilang, karena ia tidak bisa bertahan dalam sistem yang bersih dan transparan. Anda naik menjadi pemimpin baru Indonesia, membawa harapan untuk perubahan yang lebih baik. Namun, perjalanan Anda belum selesai. Tantangan baru menanti dalam menjalankan pemerintahan.\r\n" +
                        "\r\n" +
                        "\"Selamat, Anda memenangkan pemilu dengan kejujuran! Namun, menjaga kekuasaan dan tetap berada di jalan yang benar akan menjadi tantangan berikutnya.\"",
                        null, null, 0, 0, null,
                        null, null, 0, 0, null,
                        null, null, 0, 0, null, true
                    );
                } else if(health >= 50 && health <= 100) {
                    outro = new Scene(
                        "Setelah pertarungan sengit, Anda akhirnya dinyatakan sebagai pemenang pemilu. Namun, kemenangan ini tidak sepenuhnya bersih. Anda terpaksa membuat beberapa kesepakatan dengan pihak tertentu untuk memastikan kemenangan, dan meskipun tidak sepenuhnya ilegal, hal ini tetap meninggalkan noda dalam perjalanan Anda.\r\n" + //
                        "\r\n" + 
                        "Fraud Demon tidak sepenuhnya kalah, ia hanya bersembunyi dalam bayang-bayang kekuasaan. Anda berhasil naik ke puncak, tetapi apakah Anda bisa tetap berpegang pada idealisme Anda? Atau apakah kegelapan politik perlahan akan menguasai Anda?\r\n" + //
                        "\r\n" + 
                        "\"Anda telah memenangkan pemilu, tetapi apakah kemenangan ini benar-benar milik Anda, atau milik orang-orang yang membantu Anda naik ke atas?\"",
                        null, null, 0, 0, null,
                        null, null, 0, 0, null,
                        null, null, 0, 0, null, true
                    );
                } else if(health >= 0 && health <= 50) {
                    outro = new Scene(
                        "Meskipun Anda telah berjuang keras, hasil pemilu menunjukkan bahwa Anda kalah. Kecurangan yang terjadi begitu masif, dan Anda tidak memiliki cukup kekuatan untuk melawannya. Rakyat turun ke jalan menuntut keadilan, tetapi tekanan dari elite politik dan sistem yang korup terlalu besar." +
                        "\r\n" +
                        "Fraud Demon tertawa puas, menyaksikan bagaimana harapan Anda dihancurkan oleh sistem yang sudah berakar dalam kegelapan. Anda bisa memilih untuk terus berjuang dari luar sistem sebagai oposisi atau meninggalkan dunia politik sepenuhnya." +
                        "\r\n" +
                        "\"Anda kalah dalam pemilu ini, tetapi apakah perjuangan Anda benar-benar berakhir? Atau ini hanyalah awal dari perlawanan yang lebih besar?\"",
                        null, null, 0, 0, null,
                        null, null, 0, 0, null,
                        null, null, 0, 0, null, true
                    );
                }
                Scene scene5 = new Scene(
                    "Hari Pemilihan\r\nSetelah perjalanan panjang, tibalah hari pemilihan. Namun, monster terakhir, Fraud Demon, mencoba menggagalkan hasil pemilu dengan kecurangan. Apa langkah Anda?",
                    "Menggunakan \"Gugatan Hukum\" untuk menantang hasil pemilu.", outro, 15, 15, null,
                    "Menerima hasil dengan lapang dada demi stabilitas negara.", outro, 10, 10, null,
                    "Mengajak \"Pemberontakan Massa\" untuk menuntut keadilan.", outro, 25, 30, null, false
                );

                Scene scene4c3 = new Scene(
                    player.getName() + " memilih untuk meluncurkan \"Program Ekonomi Nasional\" untuk meningkatkan daya beli rakyat dan UMKM, Apa yang akan " + player.getName() + " lakukan?",
                    "Memberikan subsidi besar-besaran untuk UMKM dan petani.", scene5, 10, 15, null,
                    "Membentuk program kerja nasional untuk mengurangi pengangguran.", scene5, 12, 18, null,
                    "Mengurangi pajak usaha kecil agar lebih banyak bisnis berkembang.", scene5, 8, 12, null, false
                );

                Scene scene4c2 = new Scene(
                    player.getName() + " memilih untuk menerapkan \"Kebijakan Ketat\" dengan pemotongan anggaran besar-besaran dan reformasi birokrasi, Apa yang akan " + player.getName() + " lakukan?",
                    "Menghapus subsidi BBM dan mengalokasikannya untuk infrastruktur.", scene5, 12, 18, null,
                    "Melakukan audit menyeluruh untuk menghilangkan korupsi anggaran.", scene5, 15, 20, null,
                    "Menerapkan pajak tinggi bagi perusahaan besar untuk menutupi defisit.", scene5, 10, 15, null, false
                );

                Scene scene4c1 = new Scene(
                    player.getName() + " memilih untuk menggunakan \"Diplomasi Ekonomi\" untuk menarik investasi asing dan memperbaiki regulasi. " + player.getName() + " selanjutnya memutuskan untuk... ",
                    "Menjalin perjanjian dagang dengan negara maju.", scene5, 8, 12, null,
                    "Meningkatkan hubungan dengan organisasi internasional.", scene5, 10, 15, null,
                    "Mengundang investor besar untuk mendukung ekonomi nasional.", scene5, 12, 18, null, false
                );

                Scene scene4 = new Scene(
                    "Krisis Nasional\r\nTiba-tiba, Chaos Behemoth muncul, melambangkan krisis ekonomi yang melanda negeri. Negara menunggu tindakan Anda. apa yang akan" + player.getName() + " lakukan?",
                    "Menggunakan \"Diplomasi Ekonomi\" untuk menarik investasi asing dan memperbaiki regulasi. ", scene4c1, 10, 15, null,
                    "Menerapkan \"Kebijakan Ketat\" dengan pemotongan anggaran besar-besaran dan reformasi birokrasi. ", scene4c2, 15, 20, null,
                    "Meluncurkan \"Program Ekonomi Nasional\" untuk meningkatkan daya beli rakyat dan UMKM. ", scene4c3, 12, 18, null, false
                );

                Scene scene3c3 = new Scene(
                    player.getName() + " Memutuskan untuk Menyerang kelemahan lawan secara langsung, menggunakan taktik Phantom melawannya. " + player.getName() + " selanjutnya memutuskan untuk... ",
                    "Menggunakan video lama lawan untuk membuktikan inkonsistensi. ", scene4, 12, 18, null,
                    "Menyerang kebijakan buruk yang pernah dibuat lawan. ", scene4, 15, 20, null,
                    "Menghadapkan lawan dengan saksi kunci di panggung debat. ", scene4, 18, 22, null, false
                );

                Scene scene3c2 = new Scene(
                    player.getName() + " Memutuskan untuk Menggunakan \"Serangan Data\" untuk membongkar kebohongan dan menyajikan fakta. " + player.getName() + " selanjutnya memutuskan untuk... ",
                    "Menunjukkan laporan audit dan bukti kuat. ", scene4, 8, 12, null,
                    "Menggunakan akademisi untuk mendukung argumen Anda. ", scene4, 10, 15, null,
                    "Membuka arsip kebijakan dan membandingkannya dengan lawan. ", scene4, 12, 18, null, false
                );

                Scene scene3c1 = new Scene(
                    player.getName() + " memilih untuk Menggunakan \"Retorika Emosional\" untuk menarik simpati rakyat dan melemahkan Phantom. " + player.getName() + " selanjutnya memutuskan untuk... " ,
                    "Menggunakan kisah pribadi untuk menyentuh hati rakyat.", scene4, 5, 10, null,
                    "Menyuarakan keadilan sosial yang menyentuh masyarakat luas.", scene4, 4, 8, null,
                    "Menggunakan strategi pidato yang memotivasi rakyat. ", scene4, 6, 12, null, false
                );

                Scene scene3 = new Scene(
                    "Debat Publik\r\nAnda menghadapi Manipulasi Phantom, bayangan yang mengendalikan emosi publik dan menciptakan ilusi untuk melemahkan lawan. Bagaimana Anda menghadapi makhluk ini?",
                    "Menggunakan \"Retorika Emosional\" untuk menarik simpati rakyat dan melemahkan Phantom. ", scene3c1, 5, 10, null,
                    "Menggunakan \"Serangan Data\" untuk membongkar kebohongan dan menyajikan fakta. ", scene3c2, 10, 15, null,
                    "Menyerang kelemahan lawan secara langsung, menggunakan taktik Phantom melawannya. ", scene3c3, 15, 20, null, false
                );

                Scene scene2c3 = new Scene(
                    player.getName() + " memilih untuk Menyerang balik dengan mengungkap skandal lawan politik tanpa melibatkan diri dalam korupsi. " + player.getName() + " selanjutnya memutuskan untuk... ",
                    "Menyerang balik dengan mengungkap skandal lawan politik tanpa melibatkan diri dalam korupsi. ", scene3, 5, 5, null,
                    "Membocorkan dokumen rahasia melalui konferensi publik.", scene3, 5, 5, null,
                    "Menggunakan strategi debat untuk mengungkap skandal.", scene3, 7, 6, null, false
                );

                Scene scene2c2 = new Scene(
                    player.getName() + " memilih untuk Menolaknya dan mengungkap kasus korupsi yang melibatkan lawan politik. " + player.getName() + " selanjutnya memutuskan untuk... ",
                    "Mengadakan konferensi pers untuk mengungkap fakta.", scene3, 3, 8, null,
                    "Memberikan bukti ke KPK secara diam-diam.", scene3, 5, 10, null,
                    "Menggunakan whistleblower dari dalam sistem.", scene3, 7, 12, null, false
                );

                Scene scene2c1 = new Scene(
                    player.getName() + " memilih untuk Menerima \"bantuan\" dari Hydra untuk mempercepat kemenangan. " + player.getName() + " selanjutnya memutuskan untuk... ",
                    "Menggunakan dana gelap untuk kampanye iklan. ", scene3, 20, 15, null,
                    "Mengamankan dukungan politik dengan janji posisi di pemerintahan. ", scene3, 18, 12, null,
                    "Menjalin hubungan dengan pengusaha besar untuk dana kampanye.", scene3, 15, 10, null, false
                );

                Scene scene2 = new Scene(
                    "Tantangan Politik\r\nMonster berikutnya muncul: Korupsi Hydra, makhluk berkepala banyak yang menawarkan \"jalan pintas\" untuk kemenangan Anda. Apa yang Anda lakukan?",
                    "Menerima \"bantuan\" dari Hydra untuk mempercepat kemenangan.", scene2c1, 20, 15, null,
                    "Menolaknya dan mengungkap kasus korupsi yang melibatkan lawan politik.", scene2c2, 5, 10, null,
                    "Menyerang balik dengan mengungkap skandal lawan politik tanpa melibatkan diri dalam korupsi.", scene2c3, 5, 5, null, false
                );

                Scene scene1c3 = new Scene(
                    player.getName() + " memilih untuk Terjun langsung ke daerah-daerah terpencil untuk meyakinkan rakyat secara langsung." + player.getName() + " selanjutnya memutuskan untuk... ",
                    "Mengadakan pertemuan terbuka dan mendengarkan keluhan rakyat. ", scene2, 10, 15, null,
                    "Membangun program sosial yang membantu warga miskin.", scene2, 15, 20, null,
                    "Menyebarkan tim relawan untuk bekerja di komunitas.", scene2, 12, 8, null, false
                );

                Scene scene1c2 = new Scene(
                    player.getName() + " memilih untuk Gunakan serangan \"Kampanye Digital\" untuk menyebarkan kebenaran dan menarik perhatian generasi muda. " + player.getName() + " selanjutnya memutuskan untuk... ",
                    "Menggunakan influencer terkenal untuk membantu kampanye. ", scene2, 5, 10, null,
                    "Mengoptimalkan strategi SEO dan sosial media.", scene2, 3, 8, null,
                    "Mengembangkan aplikasi interaktif untuk mendidik masyarakat.", scene2, 7, 12, null, false
                );

                Scene scene1c1 = new Scene(
                    player.getName() + " Memlilih untuk membentuk aliansi dengan partai besar agar memiliki perlindungan politik terhadap serangan hoax. langkah " + player.getName() + " selanjutnya memutuskan untuk..",
                    "Bergabung dengan partai terbesar dan mendapatkan sumber daya lebih besar.", scene2, 10, 15, null,
                    "Membentuk koalisi partai kecil yang memiliki kesamaan visi.", scene2, 7, 12, null,
                    "Melobi elite politik untuk memperkuat jaringan.", scene2, 12, 18, null, false
                );

                Scene scene1 = new Scene(
                    "Premis\r\n" +
                    "Di tahun 2030, Indonesia menghadapi pemilu yang paling panas sepanjang sejarah. Anda berperan sebagai "+ player.getName() +", seorang politisi muda yang bercita-cita menjadi pemimpin Indonesia. Untuk mencapai kursi kekuasaan, Anda harus melewati berbagai tantangan dan mengambil keputusan penting yang akan menentukan nasib Anda dan bangsa ini." + 
                    "Anda baru saja mengumumkan pencalonan diri sebagai calon presiden. Tapi sebelum kampanye dimulai, Anda harus memutuskan strategi utama.",
                    "Bentuk aliansi dengan partai besar agar memiliki perlindungan politik terhadap serangan hoax.", scene1c1, 10, 15, null,
                    "Gunakan serangan \"Kampanye Digital\" untuk menyebarkan kebenaran dan menarik perhatian generasi muda.", scene1c2, 5, 10, null,
                    "Terjun langsung ke daerah-daerah terpencil untuk meyakinkan rakyat secara langsung.", scene1c3, 15, 20, null, false
                );

                Story story = new Story(scene1, player);
                story.start();

            } else if (input == 2) {
                System.out.println("Terima kasih telah bermain!");
                break;
            } else {
                System.out.println("Input tidak valid!");
            }
            myScanner.close();
        }
    }
}