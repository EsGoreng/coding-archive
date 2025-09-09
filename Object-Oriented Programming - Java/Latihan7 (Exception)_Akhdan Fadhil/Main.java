import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {

        //1. Error Pembagian NOL
        int a = 056;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Hasil dari " + a + " / " + b + " = " + result);;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Pembagian nol tidak diperbolehkan.");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        //2.Error saat hendak menginput file
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("102022400056.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            if(inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                    System.out.println("Error saat menutup file : " + e.getMessage());
                }
            }
        }

        //3.custom exception 1
        InvalidNIMException belajar = new InvalidNIMException(null); 
        try {
            belajar.validateNIM("102022400055");
        } catch (InvalidNIMException e) {
            System.out.println("Error : " + e.getMessage());
        }

        //4.custom exception 2
        NegativeNumberException number = new NegativeNumberException(null);
        try {
            number.validateNumber(-1);
        } catch (NegativeNumberException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}