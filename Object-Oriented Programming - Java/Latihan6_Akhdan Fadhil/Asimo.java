import java.util.Scanner;

public class Asimo {
    String nama;
    int energy;

    public Asimo(String name, int energi){
        this.energy = energi;
        this.nama = name;
    }

    public void stat(){
        System.out.println("energi " + nama + " sekarang adalah : " + this.energy);
    }

    public void serang(){
        this.energy = energy - 5;
        if(this.energy < 0){
            this.energy = 0;
        }
        System.out.println("energi " + nama + " berkurang -5\n" + "energi " + nama + " sekarang adalah : " + this.energy);
    }

    public void recharge(){
        this.energy = energy + 20;
        System.out.println("energi " + nama + " bertambah +20\n" + "energi " + nama + " sekarang adalah : " + this.energy);
    }

    public static void main(String[] args) {
        Asimo Asimo1 = new Asimo("Asimo Satu", 100);
        Asimo Asimo2 = new Asimo("Asimo Dua", 100) ;
        Scanner myScanner = new Scanner(System.in);

        while(true){
            System.out.println("Tugas OOP - Serang Asimo - 102022400056");
            System.out.println("1.Tampilkan Stat Asimo");
            System.out.println("2.Serang Asimo Lawan");
            System.out.println("3.Asimo Lawan Recharge energi");
            System.out.println("4.Asimo Lawan menyerang");
            System.out.println("5.Recharge Energi");
            System.out.println("6.Exit");
            System.out.print("Masukan Input : ");
            int input = myScanner.nextInt();
            if(input == 1){
                System.out.println("");
                Asimo1.stat();
                Asimo2.stat();
                System.out.println("");
                continue;
            } else if(input == 2){
                System.out.println("");
                Asimo2.serang();
                System.out.println("");
                continue;
            } else if(input == 3){
                System.out.println("");
                Asimo2.recharge();
                System.out.println("");
                continue;
            } else if(input == 4){
                System.out.println("");
                Asimo1.serang();
                System.out.println("");
                continue;
            } else if(input == 5){
                System.out.println("");
                Asimo1.recharge();
                System.out.println("");
                continue;
            } else if(input == 6){
                System.out.println("");
                myScanner.close();
                break;
            } else {
                System.out.println("");
                System.out.println("input invalid !!");
                System.out.println("");
                continue;
            }
        }


    }
}
