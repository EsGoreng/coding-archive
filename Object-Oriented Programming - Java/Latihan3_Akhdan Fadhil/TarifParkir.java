public class TarifParkir {
    public static void main(String[] args) {
 
        int tarif2JamPertama = 7000;
        int tarifJamBerikutnya = 5000;
        int waktu = 2;

        int waktuSejamKedepan = 5;

        for(int waktuSekarang = 2; waktuSekarang < waktuSejamKedepan; waktuSekarang++) {
            System.out.println("Waktu Sekarang = " + waktuSekarang + " Jam");
            System.out.println("Tarif : " + tarif2JamPertama);
            System.out.println("");
            tarif2JamPertama = tarif2JamPertama + tarifJamBerikutnya;
            waktu = waktu + 1;
        }

        if(tarif2JamPertama == 17000) {
            System.out.println("Biaya tarif yang harus dibayar : " + tarif2JamPertama);
            System.out.println("Waktu yang dihabiskan : " + waktu + " Jam");
        }
        else {
            System.out.println("Biaya tarif yang harus dibayar : " + tarif2JamPertama);
            System.out.println("Waktu yang dihabiskan : " + waktu + " Jam");
        }

    }
}