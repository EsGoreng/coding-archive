import java.util.Scanner;

public class Story {
    private Scene startScene;
    private Character player;
    private Scanner scanner;

    public Story(Scene startScene, Character player) { // Constructor untuk menerima Scene dan Character dari Main.java
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        play();
    }

    private void play() { // metode untuk memulai permainan
        Scene currentScene = startScene; // menginisialisasi currentScene dengan startScene yang diberikan pada konstruktor 
        while (currentScene != null) { // selama currentScene tidak null, teruskan permainan
            currentScene.displayScene(); // menampilkan scene saat ini
            System.out.print("Pilihanmu: ");
            String input = scanner.nextLine().trim(); // membaca input dari pengguna dan menghapus spasi di awal dan akhir

            if (input.equalsIgnoreCase("INFO")) { // jika pengguna memasukkan "INFO", tampilkan informasi karakter
                System.out.println("Kesehatan: " + player.getHealth());
                System.out.println("XP: " + player.getXP());
                System.out.println("Item: " + (player.getItem() == null ? "Tidak ada" : player.getItem()));
                continue;
            } else if (input.equalsIgnoreCase("QUIT")) {   // jika pengguna memasukkan "QUIT", keluar dari permainan
                break;
            }
            Scene nextScene = currentScene.makeChoice(input, player);

            if (nextScene == null) {
                System.out.println("Pilihan tidak valid!");
            } else {
                currentScene = nextScene;
            }
        
            if (player.getHealth() <= 0) {
                System.out.println("Kesehatanmu habis! Game Over.");
                scanner.close();
                break;
            }
        }
        scanner.close();
    }
}