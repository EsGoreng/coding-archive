package Latihan1;

import java.util.Random;

public class latihan3 {
    public static void main(String[] args) {
        int[][] matriks = new int[3][3];
        
        Random random = new Random();
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] = random.nextInt(100);
            }
        }
        
        System.out.println("Matrik : ");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        
        int total = 0;
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                total += matriks[i][j];
            }
        }
        
        System.out.println("Jumlah semua elemen: " + total);
    }
}