package Latihan1;

import java.util.Random;

public class latihan4 {
    public static void main(String[] args) {
       
        int[][] matriksA = new int[2][2];
        int[][] matriksB = new int[2][2];
        int[][] hasil = new int[2][2];
        
        Random random = new Random();
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                matriksA[i][j] = random.nextInt(10); 
                matriksB[i][j] = random.nextInt(10); 
            }
        }
        
        
        System.out.println("Matriks A:");
        tampilkanMatriks(matriksA);
        
        System.out.println("Matriks B:");
        tampilkanMatriks(matriksB);
       
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
        
        System.out.println("Hasil Penjumlahan:");
        tampilkanMatriks(hasil);
    }
    
    public static void tampilkanMatriks(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}