package Latihan1;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        int[] angka = {5,10,15,20,25};
        Scanner myScanner = new Scanner(System.in);
        int panjang = angka.length;

        boolean ditemukan = false;
        
        System.out.println("Array: [5, 10, 15, 20, 25]");
        System.out.print("Masukan nilai yang ingin dicari : ");
        int input = myScanner.nextInt();
        for(int i = 0; i < panjang; i++) {
            if (angka[i] == input) {
                System.out.println("nilai " + input + " ditemukan pada indeks: " + (i));
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("nilai " + input + " tidak ditemukan dalam array");
        }

        myScanner.close();

    }
}
