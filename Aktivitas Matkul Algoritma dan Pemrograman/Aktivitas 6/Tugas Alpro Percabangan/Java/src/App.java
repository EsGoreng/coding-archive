/*
 Nama  : Itsna Akhdan Fadhil
 NIM   : 102022400056
 Kelas : SI-48-08
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input_Scanner_0056 = new Scanner(System.in);

        System.out.println("///// Program input nilai /////");
        System.out.println("");
        System.out.print("Masukan input : ");
        int input_0056 = input_Scanner_0056.nextInt();
        System.out.println("");
        if (input_0056 >= 60) {
            System.out.println("Lulus");
        } 
        else {
            System.out.println("Tidak Lulus");
        }

        if (input_0056 >= 90) {
            System.out.println("Grade : A");
        }
        else if (input_0056 >= 80) {
            System.out.println("Grade : AB");
        }
        else if (input_0056 >= 70) {
            System.out.println("Grade : B");
        }
        else if (input_0056 >= 60) {
            System.out.println("Grade : C");
        }
        else 
        {
            System.out.println("Grade : D");
        }
        System.out.println("");
        System.out.println("///////////////////////////////");
    }
}
