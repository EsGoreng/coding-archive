import java.util.Scanner;

public class InputAngkaHari {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Input Angka 1-7");
        int Input = myScanner.nextInt();
        
        switch (Input) {
            case 1:
                System.out.println("Senin");
                break;

            case 2:
                System.out.println("Selasa");
                break;

            case 3:
                System.out.println("Rabu");
                break;

            case 4:
                System.out.println("Kamis");
                break;

            case 5:
                System.out.println("Jumat");
                break;

            case 6:
                System.out.println("Sabtu");
                break;
            
            case 7:
                System.out.println("Minggu");
                break;

            default:
                System.out.println("Input angka dari 1-7");
                break;
        }

        myScanner.close();

    }
}