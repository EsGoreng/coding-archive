import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.next();
//         scanner.close();

//         String kalimat = "";
//         for (int i = 0; i < input.length(); i++) {
//             char huruf = input.charAt(i);
//             kalimat = kalimat + huruf;
//             kalimat = kalimat + huruf;
//         }
//         System.out.println(kalimat);
//     }
// }

public class Main {
    public static void main(String[] args) {
        int time;
        Scanner in = new Scanner(System.in);
        time = in.nextInt();
        in.close();

        if(time < 9 || time > 21) {
            System.out.println("Toko tutup");
        } else {
            System.out.println("Toko buka");
        }
    }
}
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String kata = scanner.next();
//         scanner.close();

//         for (int i = 0; i < kata.length(); i++) {
//             char huruf = kata.charAt(i);
//             if (huruf != 'e' && huruf != 'u') {
//                 System.out.println(huruf);
//             }
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int usia = in.nextInt();
//         in.close();
        
//         if (usia < 12 || usia > 60) {
//             System.out.print("Tiket gratis");
//         } else if (usia >= 12 && usia <= 25) {
//             System.out.print("Diskon pelajar");
//         } else {
//             System.out.print("Harga normal");
//         }
//     }
// }