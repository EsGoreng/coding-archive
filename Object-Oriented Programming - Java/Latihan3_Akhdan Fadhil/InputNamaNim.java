import java.util.Scanner;

public class InputNamaNim {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Input Nama : ");
        String nama = myScanner.nextLine();
        System.out.print("Input NIM : ");
        String nim = myScanner.nextLine();
        System.out.print("");
        System.out.println("Nama : " + nama + ", NIM : " + nim);

        myScanner.close();
    }
}
