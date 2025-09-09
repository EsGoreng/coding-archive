import java.util.Scanner;

// Asimo adalah subclass dari Robot
public class Asimo {
    void talk() {
        System.out.println(" Asimo sedang berbicara");
    }

    void walking() {
        System.out.println("Asimo sedang berjalan");
    }

    void running() {
        System.out.println("Asimo sedang berlari");
    }

    void bernyanyi() {
        System.out.println("Asimo sedang bernyanyi");
    }
}

class AnakAsimo extends Asimo {
    @Override
    void talk() {
        System.out.println("Anak Asimo sedang berbicara");
    }
    @Override
    void walking() {
        System.out.println("Anak Asimo sedang berjalan");
    }
    @Override
    void running() {
        System.out.println("Anak Asimo sedang berlari");
    }
    
    void playing() {
        System.out.println("Anak Asimo sedang bermain");
    }

    void learning() {
        System.out.println("Anak Asimo sedang belajar");
    }

    @Override
    void bernyanyi() {
        System.out.println("Anak Asimo sedang bernyanyi lagu anak-anak");
    }
}

class BapaAsimo extends Asimo {
    @Override
    void talk() {
        System.out.println("Bapa Asimo sedang berbicara");
    }
    @Override
    void walking() {
        System.out.println("Bapa Asimo sedang berjalan");
    }
    @Override
    void running() {
        System.out.println("Bapa Asimo sedang berlari");
    }
    void driving() {
        System.out.println("Bapa Asimo sedang menyetir");
    }

    void bekerja() {
        System.out.println("Bapa Asimo sedang bekerja");
    }

    @Override
    void bernyanyi() {
        System.out.println("Bapa Asimo sedang bernyanyi lagu rock");
    }
}

class IstriAsimo extends Asimo {
    @Override
    void talk() {
        System.out.println("Istri Asimo sedang berbicara");
    }
    @Override
    void walking() {
        System.out.println("Istri Asimo sedang berjalan");
    }
    @Override
    void running() {
        System.out.println("Istri Asimo sedang berlari");
    }
    void cleaningHouse() {
        System.out.println("Istri Asimo sedang membersihkan rumah");
    }

    void cooking() {
        System.out.println("Istri Asimo sedang memasak");
    }

    @Override
    void bernyanyi() {
        System.out.println("Istri Asimo sedang bernyanyi lagu pop");
    }
}

// Main class untuk menjalankan program
class MainAsimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Asimo robot = new Asimo();

        System.out.println("=== Pilih Karakter ===");
        System.out.println("1. Asimo");
        System.out.println("2. Anak Asimo");
        System.out.println("3. Bapa Asimo");
        System.out.println("4. Istri Asimo");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1 -> robot = new Asimo();
            case 2 -> robot = new AnakAsimo();
            case 3 -> robot = new BapaAsimo();
            case 4 -> robot = new IstriAsimo();
            default -> {
                System.out.println("Pilihan tidak valid.");
                return;
            }
        }

        int aksi;
        do {
            System.out.println("\n=== Menu Aksi ===");
            System.out.println("1. Talk");
            System.out.println("2. Walking");
            System.out.println("3. Running");
            System.out.println("4. Bernyanyi");
            System.out.println("5. Aksi Khusus");
            System.out.println("6. Keluar");
            System.out.print("Pilih aksi: ");
            aksi = scanner.nextInt();

            switch (aksi) {
                case 1 -> robot.talk();  // Polymorphism
                case 2 -> robot.walking();
                case 3 -> robot.running();
                case 4 -> robot.bernyanyi(); // Overriding
                case 5 -> {
                    if (robot instanceof AnakAsimo anak) {
                        anak.playing();
                        anak.learning();
                    } else if (robot instanceof BapaAsimo bapa) {
                        bapa.driving();
                        bapa.bekerja();
                    } else if (robot instanceof IstriAsimo istri) {
                        istri.cleaningHouse();
                        istri.cooking();
                    } else {
                        System.out.println("Asimo tidak punya aksi khusus.");
                    }
                }
                case 6 -> System.out.println("Keluar program...");
                default -> System.out.println("Pilihan tidak valid.");
            }

        } while (aksi != 6);

        scanner.close();
    }
}
