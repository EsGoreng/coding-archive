import java.util.Scanner;

public class Mahasiswa {
    String nama;
    String NIM;
    String kelas;
    int energi;

    public Mahasiswa() {
        this.nama = "Akhdan";
        this.NIM = "102022400056";
        this.kelas = "SI4808";
        this.energi = 0;
    }

    public Mahasiswa(String Name, String nim, String Class, int Energy) {
        this.nama = Name;
        this.NIM = nim;
        this.kelas = Class;
        this.energi = Energy;
    }

    public void Tampilkaninfo(){
        System.out.println("");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Kelas : " + kelas);
        System.out.println("Energi : " + energi);
        System.out.println("");
    }

    public void InputMahasiswa(String inNama, String inNIM, String inKelas){
        this.nama = inNama;
        this.NIM = inNIM;
        this.kelas = inKelas;
        System.out.println("Data sudah di update !!");
    }

    public int Lapar(){
        int kurangEnergi = 20;
        int totalEnergi = energi - kurangEnergi;
        System.out.println("Energi anda berkurang :" + kurangEnergi + "\ntotal energi anda sekarang : " + totalEnergi + "\n");
        return energi = totalEnergi;
    }

    public int Makan(){
        int nambahEnergi = 20;
        int totalEnergi = energi + nambahEnergi;
        System.out.println("Energi anda bertambah :" + nambahEnergi + "\ntotal energi anda sekarang : " + totalEnergi + "\n");
        return energi = totalEnergi;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Mahasiswa statMahasiswa = new Mahasiswa();
        while (true) {
            System.out.println("Latihan OOP - Class & Object - 102022400056");
            System.out.println("");
            System.out.println("Pilihan :");
            System.out.println("1. Tampilkan Info");
            System.out.println("2. Input Info Mahasiswa");
            System.out.println("3. Lapar");
            System.out.println("4. Makan");
            System.out.println("5. Keluar");
            System.out.println("");
            System.out.print("Masukan Input : ");
            int input = myScanner.nextInt();
            if (input == 1) {
                statMahasiswa.Tampilkaninfo();
                continue;
            } else if (input == 2) {
                System.out.print("Input Nama : ");
                myScanner.nextLine();
                String inputNama = myScanner.nextLine();
                System.out.print("Input NIM : ");
                String inputNIM = myScanner.nextLine();
                System.out.print("Input Kelas : ");
                String inputKelas = myScanner.nextLine();
                statMahasiswa.InputMahasiswa(inputNama, inputNIM, inputKelas);
                continue;
            } else if (input == 3) {
                statMahasiswa.Lapar();
                continue;
            } else if (input == 4) {
                statMahasiswa.Makan();
                continue;
            } else if (input == 5) {
                myScanner.close();
                break;
            } else {
                System.out.println("input invalid !!");
            }
        }
    }
}